package Controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.taikhoanbean;

import bo.taikhoanbo;


/**
 * Servlet implementation class ktdkController
 */
@WebServlet("/ktdkController")
public class ktdkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8"); 
		try {
			  
			  	String HotenKH=request.getParameter("HotenKH");
				String Diachi=request.getParameter("Diachi");
				String Dienthoai=request.getParameter("Dienthoai");
				String Email=request.getParameter("Email");
				String TenDN=request.getParameter("TenDN");
				String Matkhau=request.getParameter("Matkhau");
				taikhoanbo kh=new taikhoanbo();
				taikhoanbean checkkh=kh.ktkh(TenDN);
				if (checkkh==null) {
					kh.getkh(HotenKH, Diachi, TenDN, Matkhau);
					request.setAttribute("TenDN", TenDN);
				    request.setAttribute("Matkhau", Matkhau);
					RequestDispatcher rd= request.getRequestDispatcher("ktdnController");
				    rd.forward(request, response);
				}
				else {
					
					RequestDispatcher rd= request.getRequestDispatcher("dangky.jsp");
				    rd.forward(request, response);
				}
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}    

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
