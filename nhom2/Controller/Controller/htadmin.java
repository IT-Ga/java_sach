package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bean.sanphambean;
import bo.loaibo;
import bo.sanphambo;

/**
 * Servlet implementation class htadmin
 */
@WebServlet("/htadmin")
public class htadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htadmin() {
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
			loaibo lbo = new loaibo();
		 	sanphambo sbo= new sanphambo();
		 	String ml= request.getParameter("ml");
		 	String key= request.getParameter("txtfind");
		 	ArrayList<loaibean> dsloai=lbo.getloai();
		 	ArrayList<sanphambean> dssanpham= sbo.getsach();
		    if(ml!=null) {
		    	long ml1=Long.parseLong(ml);
		    	dssanpham= sbo.TimMaLoai(dssanpham, ml1);}
		    else
		   		if(key!=null) dssanpham=sbo.Tim(dssanpham, key);
		    
		    request.setAttribute("dsloai", dsloai);
		    request.setAttribute("dssanpham", dssanpham);
		    RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
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
