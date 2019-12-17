package bo;

import java.util.ArrayList;
import java.util.Date;

import bean.SachBean;
import dao.SachDao;

public class SachBo {
	SachDao dao = new SachDao();
	ArrayList<SachBean> ds;
	public ArrayList<SachBean> getListSach() throws Exception{
		return dao.getListSach();
	}
	
	public ArrayList<SachBean> getListSachTheoMaLoai(String maloaicantim) throws Exception{
		return dao.getListSachTheoMaLoai(maloaicantim);
	}
	
	public ArrayList<SachBean> tim(String key) throws Exception{
		return dao.tim(key);
	}
	
	public int themSach(String masach, String tensach, String tacgia, long gia, String anh, Date ngaynhap, String maloai) throws Exception {
		return dao.themSach(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
	}
	
	public int capNhatSach(String masach, String tensach, String tacgia, long gia, String anh, Date ngaynhap, String maloai) throws Exception {
		return dao.capNhatSach(masach, tensach, tacgia, gia, anh, ngaynhap, maloai);
	}
	
	public int xoaSach(String masach) throws Exception {
		return dao.xoaSach(masach);
	}
	
	public SachBean timSachTheoMaSach(String masachcantim) throws Exception {
		return dao.timSachTheoMaSach(masachcantim);
	}
	
	
	
//	public ArrayList<SachBean> getListSachTheoMaLoai(String maloaicantim) throws Exception{
//		ArrayList<SachBean> tam = new ArrayList<>();
//		for (SachBean s : ds) {
//			if(s.getMaloai().equals(maloaicantim))
//				tam.add(s);
//		}
//		return tam;
//	}
//	
//	public ArrayList<SachBean> Tim(String key) throws Exception{
//		ArrayList<SachBean> tam = new ArrayList<>();
//		for (SachBean s : ds) {
//			if(s.getTensach().trim().toLowerCase().contains(key.trim().toLowerCase())
//					||s.getTacgia().trim().toLowerCase().contains(key.trim().toLowerCase()))
//				tam.add(s);
//		}
//		return tam;
//	}
}
