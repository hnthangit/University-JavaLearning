package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.LoaiBo;
import bo.SachBo;

/**
 * Servlet implementation class sachcontroller
 */
@WebServlet("/sach")
public class SachController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SachBo sachbo = new SachBo();
    LoaiBo loaibo = new LoaiBo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SachController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//Lay va tra du lieu ve client = unicode
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			request.setAttribute("dssach", sachbo.getListSach());
			request.setAttribute("dsloai", loaibo.getListLoai());
			
//			String ml = request.getParameter("ml");
//			String key = request.getParameter("txttk");
//			if(ml != null) {
//				request.setAttribute("dssach", sachbo.getListSachTheoMaLoai(ml));
//			}
//			else {
//				if(key != null) {
//					request.setAttribute("dssach", sachbo.Tim(key));
//				}
//				else {
//					request.setAttribute("dssach", sachbo.getListSach());
//				}
//			}
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
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
