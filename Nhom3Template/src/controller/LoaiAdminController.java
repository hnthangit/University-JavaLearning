package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.LoaiBo;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/loaiadmin")
public class LoaiAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoaiAdminController() {
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
		LoaiBo loaiBo = new LoaiBo();
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			String maloai = request.getParameter("txtmaloai");
			String tenloai = request.getParameter("txttenloai");
			if (request.getParameter("butthem") != null) {
				int n= loaiBo.Them(maloai, tenloai);
				if(n==0) request.setAttribute("ktnhap", 0);
				System.out.println(request.getParameter("butthem"));
			}
			if (request.getParameter("butsua") != null) {
				int n= loaiBo.Sua(maloai, tenloai);
				if(n==0) request.setAttribute("ktsua", 0);
			}
			if (request.getParameter("mlchon") != null) {
				request.setAttribute("chon", loaiBo.TimMaLoai(request.getParameter("mlchon")));
			}
			if (request.getParameter("mlxoa") != null) {
				int n= loaiBo.Xoa(request.getParameter("mlxoa"));
				if(n==0) request.setAttribute("ktxoa", 0);
			}

			request.setAttribute("dsloai", loaiBo.getListLoai());
			RequestDispatcher rd = request.getRequestDispatcher("qlloai.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
