package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.GioHangBo;
import bo.LoaiBo;
import bo.SachBo;

/**
 * Servlet implementation class ktdang
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SachBo sachbo = new SachBo();
    LoaiBo loaibo = new LoaiBo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("un");
		
		if(user==null) {
			String username = request.getParameter("txtun");
			String pass = request.getParameter("txtpass");
			
			if(username==null) {
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				
			} else {
				session.setAttribute("un", username);
				
				try {
					request.setAttribute("dssach", sachbo.getListSach());
					request.setAttribute("dsloai", loaibo.getListLoai());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				response.sendRedirect("/Nhom3Template/sach");
//				RequestDispatcher rd = request.getRequestDispatcher("/sach");
//				rd.forward(request, response);
			}
		} else {
			response.sendRedirect("/Nhom3Template/sach");
//			RequestDispatcher rd = request.getRequestDispatcher("/sach");
//			rd.forward(request, response);
		}
		
		
		
//		//Lay gia tri tu client gui len
//		String username = request.getParameter("txtun");
//		String pass = request.getParameter("txtpass");
//		//String kt = request.getParameter("kt");
//		
//		//Chay lan dau thi mo trang dang nhap.jsp
//		if(username==null) {
//			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//			rd.forward(request, response);
//		} else {
//			HttpSession session = request.getSession();
//			session.setAttribute("un", username);
//			
////			GioHangBo s = new GioHangBo();
////			try {
////				request.setAttribute("ds", s);
////			} catch (Exception e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//			
////			RequestDispatcher rd = request.getRequestDispatcher("sachcontroller");
////			rd.forward(request, response);
////			PrintWriter out = response.getWriter();
////			out.print(un + ": " + pass + ": " + kt );	
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
