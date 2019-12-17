package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.LoaiBean;
import bean.SachBean;

public class LoaiDao {
	DungChung dc = new DungChung();

	public boolean KtMa(String maloai) throws Exception {
		// Kiem tra xem ma loai co trong bang loai hay ko
		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select maloai from loai where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		boolean kq =rs.next();
		// B3: dong ket noi
		rs.close();
		return kq;
	}

	public int Them(String maloai, String tenloai) throws Exception {
		// Neu trung ma thi thoat
		// Nguoic lai thi them vao 1 loai
		// B1: ket noi, b2: thiet lap cau lenh sql, b3: tao cau lenh
		// b4: truyen tham so vao cau lenh, b5: chay cau lenh, b6: dong ket noi
		dc.KetNoi();
		if(KtMa(maloai)) return 0;
		String sql = "insert into loai(maloai, tenloai) values (?, ?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		cmd.setString(2, tenloai);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}

	public int Sua(String maloai, String tenloaimoi) throws Exception {
		dc.KetNoi();
		if(KtMa(maloai)==false) return 0;
		String sql = "update loai set tenloai=? where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, tenloaimoi);
		cmd.setString(2, maloai);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}
	
	public int Xoa(String maloai) throws Exception {
		dc.KetNoi();
		if(ktLoaiSach(maloai)) return 0;
		String sql = "delete from loai where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		int kq = cmd.executeUpdate();
		dc.cn.close();
		return kq;
	}

	public boolean ktLoaiSach(String maloai) throws Exception {
		//Kt xem ma loai nay co sach hay ko
		//Co:true, nguoc lai tra ve false.
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select maloai from sach where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		boolean kq =rs.next();
		// B3: dong ket noi
		rs.close();
		return kq;
	}
	
	public LoaiBean TimMaLoai(String maloai) throws Exception {
		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from loai where maloai=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maloai);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		LoaiBean loai =null;
		if (rs.next()) {
			String ml = rs.getString("maloai");
			String tenloai = rs.getString("tenloai");
			loai = new LoaiBean(ml, tenloai);
		}
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return loai;
	}

	public ArrayList<LoaiBean> getListLoai() throws Exception {
		ArrayList<LoaiBean> ds = new ArrayList<>();

		// B1: Ket noi vao csdl
		dc.KetNoi();
		// B2: Lay du lieu ve
		String sql = "select * from loai";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery(); // Lay du lieu ve
		while (rs.next()) {
			String maloai = rs.getString("maloai");
			String tenloai = rs.getString("tenloai");

			LoaiBean loai = new LoaiBean(maloai, tenloai);
			ds.add(loai);
		}
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return ds;
	}
}
