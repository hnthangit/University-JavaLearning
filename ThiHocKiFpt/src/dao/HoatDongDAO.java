package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bean.HoatDongBean;

public class HoatDongDAO {
	DungChung dc = new DungChung();

	public ArrayList<HoatDongBean> getListHoatDong() throws Exception {
		ArrayList<HoatDongBean> ds = new ArrayList<>();

		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from HOATDONG";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			int mahd = rs.getInt("MaHD");
			String tenhd = rs.getString("TenHD");
			String motahd = rs.getString("MoTaHD");
			Date ngaygiobd = rs.getDate("NgayGioBD");
			Date ngaygiokt = rs.getDate("NgayGioKT");
			int sltoithieuyc = rs.getInt("SLToiThieuYC");
			int sltoidayc = rs.getInt("SLToiDaYC");
			Date thoihandk = rs.getDate("ThoiHanDK");
			String trangthai = rs.getString("TrangThai");
			int matv = rs.getInt("MaTV");
			String lydohuyhd = rs.getString("LyDoHuyHD");

			HoatDongBean hoatdong = new HoatDongBean(mahd, tenhd, motahd, ngaygiobd, ngaygiokt, sltoithieuyc, sltoidayc,
					thoihandk, trangthai, matv, lydohuyhd);
			ds.add(hoatdong);
		}
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return ds;
	}

	public int addHoatDong(String tenhd, String motahd, Date ngaygiobd, Date ngaygiokt, int sltoithieuyc, int sltoidayc,
			Date thoihandk, String trangthai, int matv) throws Exception {
		// B1: Ket noi vao csdl
		dc.KetNoi();
		String sql = "insert into HOATDONG(TenHD, MoTaHD, NgayGioBD, NgayGioKT, SLToiThieuYC, SLToiDaYC, ThoiHanDK, TrangThai, MaTV) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, tenhd);
		cmd.setString(2, motahd);
		java.sql.Date ngaybd = new java.sql.Date(ngaygiobd.getTime());
		cmd.setDate(3, ngaybd);
		java.sql.Date ngaykt = new java.sql.Date(ngaygiokt.getTime());
		cmd.setDate(4, ngaykt);
		cmd.setInt(5, sltoithieuyc);
		cmd.setInt(6, sltoidayc);
		java.sql.Date dk = new java.sql.Date(thoihandk.getTime());
		cmd.setDate(7, dk);
		cmd.setString(8, trangthai);
		cmd.setInt(9, matv);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}

	public int deleteHoatDong(int mahd) throws Exception {
		// B1: Ket noi vao csdl
		dc.KetNoi();
		String sql = "delete from HOATDONG where MaHD=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setInt(1, mahd);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}

	public int updateHoatDong(int mahd, String tenhd, String motahd, Date ngaygiobd, Date ngaygiokt, int sltoithieuyc,
			int sltoidayc, Date thoihandk, String trangthai, int matv, String lydohuyhd) throws Exception {
		// B1: Ket noi vao csdl
		dc.KetNoi();
		String sql = "update HOATDONG set TenHD=?,MoTaHD=?,NgayGioBD=?,NgayGioKT=?,SLToiThieuYC=?,SLToiDaYC=?,ThoiHanDK=?, TrangThai=?, MaTV=?, LyDoHuyHD=? where MaHD=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, tenhd);
		cmd.setString(2, motahd);
		java.sql.Date ngaybd = new java.sql.Date(ngaygiobd.getTime());
		cmd.setDate(3, ngaybd);
		java.sql.Date ngaykt = new java.sql.Date(ngaygiokt.getTime());
		cmd.setDate(4, ngaykt);
		cmd.setInt(5, sltoithieuyc);
		cmd.setInt(6, sltoidayc);
		java.sql.Date dk = new java.sql.Date(thoihandk.getTime());
		cmd.setDate(7, dk);
		cmd.setString(8, trangthai);
		cmd.setInt(9, matv);
		cmd.setString(10, lydohuyhd);
		cmd.setInt(11, mahd);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
	
	public HoatDongBean getHoatDong(int id) throws Exception {
		HoatDongBean hoatdong = null;

		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from HOATDONG where MaHD=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setInt(1, id);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			int mahd = rs.getInt("MaHD");
			String tenhd = rs.getString("TenHD");
			String motahd = rs.getString("MoTaHD");
			Date ngaygiobd = rs.getDate("NgayGioBD");
			Date ngaygiokt = rs.getDate("NgayGioKT");
			int sltoithieuyc = rs.getInt("SLToiThieuYC");
			int sltoidayc = rs.getInt("SLToiDaYC");
			Date thoihandk = rs.getDate("ThoiHanDK");
			String trangthai = rs.getString("TrangThai");
			int matv = rs.getInt("MaTV");
			String lydohuyhd = rs.getString("LyDoHuyHD");

			hoatdong = new HoatDongBean(mahd, tenhd, motahd, ngaygiobd, ngaygiokt, sltoithieuyc, sltoidayc,
					thoihandk, trangthai, matv, lydohuyhd);
		}
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return hoatdong;
	}
}
