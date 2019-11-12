package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GioHangBean;
import bo.GioHangBo;

/**
 * Servlet implementation class CapnhatgiohangController
 */
@WebServlet("/capnhatgiohang")
public class CapnhatgiohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapnhatgiohangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String strsoluongthaydoi = request.getParameter("txtsoluong");
		String masachthaydoi = request.getParameter("txtmasach");
		int soluongthaydoi = Integer.parseInt(strsoluongthaydoi);
		GioHangBo gh = new GioHangBo();
		ArrayList<GioHangBean> ghb = (ArrayList<GioHangBean>) session.getAttribute("giohang");
		gh.ds = (ArrayList<GioHangBean>) ghb.clone();
		gh.thayDoiSoLuong(masachthaydoi, soluongthaydoi);
		session.setAttribute("giohang", gh.ds);
		response.sendRedirect("giohang");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
