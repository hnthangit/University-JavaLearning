package dao;

import java.util.ArrayList;

import bean.LoaiBean;
import bean.SachBean;
import bo.SachBo;

public class LoaiDao {
	public ArrayList<LoaiBean> getListLoaiSach() {
		SachBo sachBo = new SachBo();
		//tao list loai sach bao gom nhieu sach
		ArrayList<LoaiBean> ds = new ArrayList<>();
		ds.add(new LoaiBean("TOA", "Sach toan", sachBo.getListSach()));
		ds.add(new LoaiBean("VAN", "Sach Van", sachBo.getListSach()));
		ds.add(new LoaiBean("HOA", "Sach Hoa", sachBo.getListSach()));
		ds.add(new LoaiBean("SINH", "Sach Sinh", sachBo.getListSach()));
		ds.add(new LoaiBean("GDCD", "Sach GDCD", sachBo.getListSach()));
		
		//return list loai sach
		return ds;
		
	}
}
