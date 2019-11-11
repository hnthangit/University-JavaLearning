package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.GioHangBo;

/**
 * Servlet implementation class XuligiohangController
 */
@WebServlet("/xuligiohang")
public class XuligiohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XuligiohangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
				
		String ma = request.getParameter("masach");
		String ten = request.getParameter("tensach");
		String tacgia = request.getParameter("tacgia");
		String anh = request.getParameter("anh");
		String g = request.getParameter("gia");
		
		HttpSession session = request.getSession();
		if(g!=null){
			long gia = Long.parseLong(g);
			GioHangBo gh =null;
			
			//Kiem tra xem da tao ra session chua
			//Neu chua thi tao ra 1 session de luu sach
			if (session.getAttribute("giohang") == null) {
				gh = new GioHangBo();
				session.setAttribute("giohang", gh);
			
		}
			//b1: Lay session luu vao bien: gh
			gh = (GioHangBo)session.getAttribute("giohang");
			//b2: thay doi gh: goi ham them
			gh.Them(ma, ten, tacgia, anh, 1, gia);
			//b3: luu bien vao session
			session.setAttribute("gh", gh);
			//Hien thi gio hang
			response.sendRedirect("giohang");
			
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
