package bo;

import java.util.ArrayList;

import bean.LoaiBean;
import dao.LoaiDao;

public class LoaiBo {
	LoaiDao loaidao = new LoaiDao();
	
	public ArrayList<LoaiBean> getListLoai() throws Exception{
		return loaidao.getListLoai();
	}
	
	public int Them(String maloai, String tenloai) throws Exception {
		return loaidao.Them(maloai, tenloai);
	}
	
	public int Sua(String maloai, String tenloaimoi) throws Exception {
		return loaidao.Sua(maloai, tenloaimoi);
	}
	
	public int Xoa(String maloai) throws Exception {
		return loaidao.Xoa(maloai);
	}
	
	public LoaiBean TimMaLoai(String maloai) throws Exception {
		return loaidao.TimMaLoai(maloai);
	}
}
