package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import bean.lichsuMHbean;
import bean.taikhoanbean;
import bo.lichsuMHbo;

/**
 * Servlet implementation class lichsuMHController
 */
@WebServlet("/lichsuMHController")
public class lichsuMHController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lichsuMHController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setCharacterEncoding("utf-8");
			request.setCharacterEncoding("utf-8");
			lichsuMHbo lsbo= new lichsuMHbo();
			ArrayList<lichsuMHbean> dsls= new ArrayList<lichsuMHbean>();
			HttpSession session= request.getSession();
			taikhoanbean kh=(taikhoanbean)session.getAttribute("dn");
			long makh=kh.getID();
			session.removeAttribute("gh");
			if(kh!=null) dsls=lsbo.getlsMH(makh);
			request.setAttribute("dsls", dsls);
			
			  RequestDispatcher rd= request.getRequestDispatcher("lichsu.jsp");
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
