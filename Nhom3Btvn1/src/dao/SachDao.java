package dao;

import java.util.ArrayList;

import bean.SachBean;

public class SachDao {
	public ArrayList<SachBean> getListSach() {
		ArrayList<SachBean> ds = new ArrayList<>();
		ds.add(new SachBean("s1", "csdl", "thang", (long)5000, "a1.jpg"));
		ds.add(new SachBean("s2", "sinh", "thien", (long)2000, "a3.jpg"));
		ds.add(new SachBean("s3", "hoa", "anh", (long)70000, "a4.jpg"));
		ds.add(new SachBean("s4", "ly", "khanh", (long)6000, "a5.jpg"));
		ds.add(new SachBean("s5", "toan", "tinh", (long)9000, "b1.jpg"));
		return ds;
	}
}
