package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.taikhoanbean;
import bo.taikhoanbo;

/**
 * Servlet implementation class ktdnadmin
 */
@WebServlet("/ktdnadmin")
public class ktdnadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdnadmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session= request.getSession();
			taikhoanbo khbo=new taikhoanbo();
			
		   	String un=request.getParameter("TenDN");
		   	String pass=request.getParameter("Matkhau");
		    taikhoanbean kh=khbo.ktdn(un, pass);
		   	if(kh!=null&&kh.getGhiChu()==0){
		   		session.setAttribute("dn", kh);
		   			   session.setAttribute("kt", (long)1);
		   			  
		   		   }else{
		   			   
		   			   session.setAttribute("kt", (long)0);
		   		   }
		   	RequestDispatcher rd= request.getRequestDispatcher("htadmin");
		    rd.forward(request, response);
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
