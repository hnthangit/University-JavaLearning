package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.SachBean;

public class SachDao {
	DungChung dc = new DungChung();

	public ArrayList<SachBean> getListSach() throws Exception {
		ArrayList<SachBean> ds = new ArrayList<>();
		// ds.add(new SachBean("s1", "csdl", "thang", (long)5000, "a1.jpg"));
		// ds.add(new SachBean("s2", "sinh", "thien", (long)2000, "a3.jpg"));
		// ds.add(new SachBean("s3", "hoa", "anh", (long)70000, "a4.jpg"));
		// ds.add(new SachBean("s4", "ly", "khanh", (long)6000, "a5.jpg"));
		// ds.add(new SachBean("s5", "toan", "tinh", (long)9000, "b1.jpg"));

		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from sach";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			String masach = rs.getString("masach");
			String tensach = rs.getString("tensach");
			String tacgia = rs.getString("tacgia");
			long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			String maloai = rs.getString("maloai");
			
			SachBean sach = new SachBean(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
			ds.add(sach);
		}	
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public ArrayList<SachBean> getListSachTheoMaLoai(String maloaicantim) throws Exception {
		ArrayList<SachBean> ds = new ArrayList<>();

		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from sach where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maloaicantim);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			String masach = rs.getString("masach");
			String tensach = rs.getString("tensach");
			String tacgia = rs.getString("tacgia");
			long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			String maloai = rs.getString("maloai");
			
			SachBean sach = new SachBean(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
			ds.add(sach);
		}	
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public SachBean timSachTheoMaSach(String masachcantim) throws Exception {
		SachBean sach = null;
		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from sach where masach = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, masachcantim);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			String masach = rs.getString("masach");
			String tensach = rs.getString("tensach");
			String tacgia = rs.getString("tacgia");
			long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			String maloai = rs.getString("maloai");
			
			sach = new SachBean(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
		}	
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return sach;
	}
	
	public boolean kiemTraMaSach (String maSach) throws Exception {
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from sach where masach = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maSach);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		boolean kq = rs.next();
		// B3: dong ket noi
		rs.close();
		return kq;
	}
	
	public int themSach (String masach, String tensach, String tacgia, long gia, String anh, Date ngaynhap, String maloai) throws Exception {
		dc.KetNoi();
		if(kiemTraMaSach(masach)) return 0;
		String sql = "insert into sach(masach, tensach, tacgia, gia, anh, ngaynhap, maloai) values (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, masach);
		cmd.setString(2, tensach);
		cmd.setString(3, tacgia);
		cmd.setLong(4, gia);
		cmd.setString(5, anh);
		java.sql.Date ngay = new java.sql.Date(ngaynhap.getTime());
		cmd.setDate(6, ngay);
		cmd.setString(7, maloai);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
	
	public int capNhatSach(String masach, String tensach, String tacgia, long gia, String anh, Date ngaynhap, String maloai) throws Exception {
		dc.KetNoi();
		if(kiemTraMaSach(masach)) return 0;
		String sql = "update loai set tensach=?, tacgia=?, gia=?, anh=?, ngaynhap=?, maloai=? where masach = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, tensach);
		cmd.setString(2, tacgia);
		cmd.setLong(3, gia);
		cmd.setString(4, anh);
		java.sql.Date ngay = new java.sql.Date(ngaynhap.getTime());
		cmd.setDate(5, ngay);
		cmd.setString(6, maloai);
		cmd.setString(7, masach);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
	
	public int xoaSach(String masach) throws Exception {
		dc.KetNoi();
		String sql = "delete from sach where masach=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, masach);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;		
	}
	
	public ArrayList<SachBean> tim(String key) throws Exception {
		ArrayList<SachBean> ds = new ArrayList<>();

		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from sach where tensach like ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, "%" + key + "%");
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			String masach = rs.getString("masach");
			String tensach = rs.getString("tensach");
			String tacgia = rs.getString("tacgia");
			long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			Date ngaynhap = rs.getDate("ngaynhap");
			String maloai = rs.getString("maloai");
			
			SachBean sach = new SachBean(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
			ds.add(sach);
		}	
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return ds;
	}
}
