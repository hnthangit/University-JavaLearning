package bo;

import java.util.ArrayList;

import bean.SachBean;
import dao.SachDao;

public class SachBo {
	SachDao dao = new SachDao();
	public ArrayList<SachBean> getListSach(){
		return dao.getListSach();
	}
}
