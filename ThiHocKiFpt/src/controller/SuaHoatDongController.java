package controller;

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

import bean.HoatDongBean;
import bo.HoatDongBo;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class SuaHoatDongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaHoatDongController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HoatDongBo hoatDongBO = new HoatDongBo();
		int mahd = Integer.parseInt(request.getParameter("id"));
		if (request.getParameter("tenhd") == null) {
			try {
				HoatDongBean hoatDong = hoatDongBO.getHoatDong(mahd);
				request.setAttribute("hoatdong", hoatDong);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);
		} else {
			

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
				String lydohuyhd = request.getParameter("lydohuyhd");

				hoatDongBO.updateHoatDong(mahd, tenhd, mota, ngaybd, ngaykt, toithieu, toida, thoihandk, trangthai, matv, lydohuyhd);

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
