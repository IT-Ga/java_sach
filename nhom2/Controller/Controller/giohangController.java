package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.giohangbo;

/**
 * Servlet implementation class giohangController
 */
@WebServlet("/giohangController")
public class giohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public giohangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String masach=request.getParameter("ms");
		String tensach=request.getParameter("ts");
		String tacgia=request.getParameter("tg");
		String giatam=request.getParameter("gia");
		

		
		// Nếu người dùng mua lần đầu tiên
			giohangbo gh=null;
			if(session.getAttribute("gh")==null){
				gh=new giohangbo();
				session.setAttribute("gh", gh);
			}
			
			if (masach!=null)
			{
				//b1: gán sesion vào biến
				gh=(giohangbo) session.getAttribute("gh");
				gh.Them(masach, tensach, tacgia, Long.parseLong(giatam), (long) 1);// thay đổi biến
				session.setAttribute("gh", gh);// luu biến vào session
			}
			
			
			//Hiển thị giỏ
			 //response.sendRedirect("htgio.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("htgioController");
		    rd.forward(request, response);
			 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
