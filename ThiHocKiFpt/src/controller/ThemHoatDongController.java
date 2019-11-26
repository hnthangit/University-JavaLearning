package controller;

import java.io.Console;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.HoatDongBo;

/**
 * Servlet implementation class ThemHoatDongController
 */
@WebServlet("/add")
public class ThemHoatDongController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThemHoatDongController() {
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
		String ten = request.getParameter("tenhd");
		System.out.println(ten);
		if (request.getParameter("tenhd") == null) {
			RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);
		} else {
			HoatDongBo hoatDongBO = new HoatDongBo();

			try {
				String tenhd = request.getParameter("tenhd");
				String mota = request.getParameter("mota");
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

				Date ngaybd = df.parse(request.getParameter("ngaybd"));
				Date ngaykt = df.parse(request.getParameter("ngaykt"));
				Date thoihandk = df.parse(request.getParameter("thoihandk"));
				System.out.println(ngaybd);
				System.out.println(ngaykt);
				System.out.println(thoihandk);

				int toithieu = Integer.parseInt(request.getParameter("toithieu"));
				int toida = Integer.parseInt(request.getParameter("toida"));
				String trangthai = request.getParameter("trangthai");
				int matv = Integer.parseInt(request.getParameter("matv"));

				hoatDongBO.addHoatDong(tenhd, mota, ngaybd, ngaykt, toithieu, toida, thoihandk, trangthai, matv);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			response.sendRedirect("index");
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
