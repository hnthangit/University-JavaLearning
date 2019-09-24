package bean;

import java.util.ArrayList;

public class LoaiBean {
	private String MaLoai;
	private String TenLoai;
	private ArrayList<SachBean> SachBean;
	
	public LoaiBean(String maLoai, String tenLoai, ArrayList<bean.SachBean> sachBean) {
		super();
		MaLoai = maLoai;
		TenLoai = tenLoai;
		SachBean = sachBean;
	}
	public String getMaLoai() {
		return MaLoai;
	}
	public void setMaLoai(String maLoai) {
		MaLoai = maLoai;
	}
	public String getTenLoai() {
		return TenLoai;
	}
	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}
	public ArrayList<SachBean> getSachBean() {
		return SachBean;
	}
	public void setSachBean(ArrayList<SachBean> sachBean) {
		SachBean = sachBean;
	}
	
	
	
}
