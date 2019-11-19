package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.GioHangBean;
import bo.GioHangBo;
import bo.LoaiBo;
import bo.SachBo;

/**
 * Servlet implementation class TimsachController
 */
@WebServlet("/timsach")
public class TimsachController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SachBo sachbo = new SachBo();
    LoaiBo loaibo = new LoaiBo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimsachController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			String key = request.getParameter("key");
			key.trim().toLowerCase();
			request.setAttribute("dssach", sachbo.tim(key));
			request.setAttribute("dsloai", loaibo.getListLoai());
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		String ml = request.getParameter("ml");
//		String key = request.getParameter("txttk");
//		if(ml != null) {
//			request.setAttribute("dssach", sachbo.getListSachTheoMaLoai(ml));
//		}
//		else {
//			if(key != null) {
//				request.setAttribute("dssach", sachbo.Tim(key));
//			}
//			else {
//				request.setAttribute("dssach", sachbo.getListSach());
//			}
//		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
