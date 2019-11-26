package bo;

import java.util.ArrayList;
import java.util.Date;

import bean.HoatDongBean;
import dao.HoatDongDAO;

public class HoatDongBo {
	HoatDongDAO hoatdongDAO = new HoatDongDAO();
	
	public ArrayList<HoatDongBean> getListHoatDong() throws Exception {
		return hoatdongDAO.getListHoatDong();
	}
	
	public int addHoatDong(String tenhd, String motahd, Date ngaygiobd, Date ngaygiokt, int sltoithieuyc, int sltoidayc, Date thoihandk, String trangthai, int matv) throws Exception{
		return hoatdongDAO.addHoatDong(tenhd, motahd, ngaygiobd, ngaygiokt, sltoithieuyc, sltoidayc, thoihandk, trangthai, matv);
	}
	
	public int deleteHoatDong(int mahd) throws Exception{
		return hoatdongDAO.deleteHoatDong(mahd);
	}
	
	public int updateHoatDong(int mahd, String tenhd, String motahd, Date ngaygiobd, Date ngaygiokt, int sltoithieuyc,
			int sltoidayc, Date thoihandk, String trangthai, int matv, String lydohuyhd) throws Exception {
		return hoatdongDAO.updateHoatDong(mahd, tenhd, motahd, ngaygiobd, ngaygiokt, sltoithieuyc, sltoidayc, thoihandk, trangthai, matv, lydohuyhd);
	}
	
	public HoatDongBean getHoatDong(int id) throws Exception {
		return hoatdongDAO.getHoatDong(id);
	}
}
