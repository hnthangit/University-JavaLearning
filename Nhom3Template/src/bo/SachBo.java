package bo;

import java.util.ArrayList;

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
