package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.LoaiBean;
import bean.SachBean;

public class LoaiDao {
	DungChung dc = new DungChung();

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
			
			LoaiBean loai = new LoaiBean(maloai,tenloai);
			ds.add(loai);
		}	
		// B3: dong ket noi
		rs.close();
		dc.cn.close();
		return ds;
	}
}
