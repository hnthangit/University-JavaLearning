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

/**
 * Servlet implementation class testcontroller
 */
@WebServlet("/testcontroller")
public class testcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Tao ra doi tuong out
		PrintWriter out = response.getWriter();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		out.print("Hello");
		
		//Tao ra doi tuong session
		HttpSession session = request.getSession();
		//Gan gia tri cho session
		session.setAttribute("un", "hahah");
		//Tao ra 3 bien request
		request.setAttribute("gt1", (long)4*5);
		request.setAttribute("gt2", "Nguyen Van A");
		String[] ds = {"hehe", "haha", "hoho"};
		request.setAttribute("dsht", ds);
		RequestDispatcher rd = request.getRequestDispatcher("vd.jsp");
		rd.forward(request, response);
		//Dieu huong ve trang vidu.jsp
		//response.sendRedirect("vd.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
