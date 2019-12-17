package controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bo.LoaiBo;
import bo.SachBo;

/**
 * Servlet implementation class SachAdminController
 */
@WebServlet("/sachadmin")
public class SachAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SachBo sachBo = new SachBo();
	LoaiBo loaiBo = new LoaiBo();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SachAdminController() {
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
		Date ngaynhap = new Date();
		long gia = 0;
		String masach = null, tensach = null, tacgia = null, anh = null, ngay = null, maloai = null, giastr = null,
				butthem = null, butsua = null, mschon = null, msxoa = null;
		try {
			// Lay va tra du lieu ve client = unicode
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");

			DiskFileItemFactory factory = new DiskFileItemFactory();
			DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
			String dirUrl1 = request.getServletContext().getRealPath("") + File.separator + "files";
			response.getWriter().println(dirUrl1);
			try {
				List<FileItem> fileItems = upload.parseRequest(request);// Lấy về các đối tượng gửi lên
				// duyệt qua các đối tượng gửi lên từ client gồm file và các control
				for (FileItem fileItem : fileItems) {
					if (!fileItem.isFormField()) {// Nếu ko phải các control=>upfile lên
						// xử lý file
						String nameimg = fileItem.getName();
						if (!nameimg.equals("")) {
							// Lấy đường dẫn hiện tại, chủ ý xử lý trên dirUrl để có đường dẫn đúng
							String dirUrl = request.getServletContext().getRealPath("") + "image_sach";
							File dir = new File(dirUrl);
							if (!dir.exists()) {// nếu ko có thư mục thì tạo ra
								dir.mkdir();
							}
							String fileImg = dirUrl + File.separator + nameimg;
							File file = new File(fileImg);// tạo file
							try {
								fileItem.write(file);// lưu file
								System.out.println("UPLOAD THÀNH CÔNG...!");
								System.out.println("Đường dẫn lưu file là: " + dirUrl);
								System.out.println(fileImg);
								anh = "image_sach/" + nameimg;
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						// Neu la control
					} else {
						String tentk = fileItem.getFieldName();
						if (tentk.equals("txtmasach"))
							masach = fileItem.getString();
						if (tentk.equals("txttensach"))
							tensach = fileItem.getString();
						if (tentk.equals("txttacgia"))
							tacgia = fileItem.getString();
						if (tentk.equals("txtgia")) {
							giastr = fileItem.getString();
							gia = Long.parseLong(giastr);
						}
						if (tentk.equals("txtngay")) {
							ngay = fileItem.getString();
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							ngaynhap = df.parse(ngay);
						}
						if (tentk.equals("txtmaloai"))
							maloai = fileItem.getString();
						if (tentk.equals("butthem"))
							butthem = fileItem.getString();
						if (tentk.equals("butsua"))
							butsua = fileItem.getString();
						if (tentk.equals("mschon"))
							mschon = fileItem.getString();
					}
				}

			} catch (FileUploadException e) {
				e.printStackTrace();
			}

			if (butthem != null) {
				int n = sachBo.themSach(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
				if (n == 0)
					request.setAttribute("ktnhap", 0);
			}
			if (butsua != null) {
				int n = sachBo.capNhatSach(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
				if (n == 0)
					request.setAttribute("ktsua", 0);
			}
			if (request.getParameter("mschon") != null) {
				request.setAttribute("chon", sachBo.timSachTheoMaSach(request.getParameter("mschon")));
			}
			if (request.getParameter("msxoa") != null) {
				int n = sachBo.xoaSach(request.getParameter("msxoa"));
				if (n == 0)
					request.setAttribute("ktxoa", 0);
			}

			request.setAttribute("dssach", sachBo.getListSach());
			request.setAttribute("dsloai", loaiBo.getListLoai());

			RequestDispatcher rd = request.getRequestDispatcher("qlsach.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
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
