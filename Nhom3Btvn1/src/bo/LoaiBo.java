package bo;

import java.util.ArrayList;

import bean.LoaiBean;
import bean.SachBean;
import dao.LoaiDao;
import dao.SachDao;

public class LoaiBo {
	LoaiDao dao = new LoaiDao();
	public ArrayList<LoaiBean> getListLoaiSach(){
		return dao.getListLoaiSach();
	}
}
