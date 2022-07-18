package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.giohangbean;

import bo.CTHDbo;
import bo.giohangbo;
import bo.hoadonbo;
import dao.hoadondao;

/**
 * Servlet implementation class CTHDController
 */
@WebServlet("/CTHDController")
public class CTHDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CTHDController() {
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
			HttpSession session= request.getSession();
			giohangbo gh1=(giohangbo) session.getAttribute("gh");
			int n=gh1.ds.size();
            for(int i=0;i<=n;i++) {
              giohangbean s=gh1.ds.get(i);
				String masp=s.getMaSP();
			   long slmua=s.getSlmua();
			   String damua="False";
			   
			  CTHDbo cthd1=new CTHDbo();
			  int mahd=cthd1.maxhd();
				cthd1.getcthd(masp, slmua,mahd , damua);
				RequestDispatcher rd= request.getRequestDispatcher("lichsuMHController");
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
