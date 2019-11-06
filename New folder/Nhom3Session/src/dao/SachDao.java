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
}
