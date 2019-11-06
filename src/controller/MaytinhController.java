package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaytinhController
 */
@WebServlet("/MaytinhController")
public class MaytinhController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaytinhController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		long kq = 0;
		if (request.getParameter("txtso1") == null) {
			RequestDispatcher rd = request.getRequestDispatcher("maytinh.jsp");
			rd.forward(request, response);
			
		} else {
			
			Long so1 = Long.parseLong(request.getParameter("txtso1"));
			Long so2 = Long.parseLong(request.getParameter("txtso2"));
			String but1 = (String) request.getParameter("but1");
			if (but1.equals("+"))
				kq = so1 + so2;
			else if (but1.equals("-"))
				kq = so1 - so2;
			else if (but1.equals("/"))
				kq = so1 / so2;
			else
				kq = so1 * so2;
			System.out.println(kq);
			request.setAttribute("txtso1", so1);
			request.setAttribute("txtso2", so2);
			request.setAttribute("kq", kq);
			RequestDispatcher rd = request.getRequestDispatcher("maytinh.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
