package bo;

import java.util.ArrayList;

import bean.SachBean;
import dao.SachDao;

public class SachBo {
	SachDao dao = new SachDao();
	public ArrayList<SachBean> getListSach() throws Exception{
		return dao.getListSach();
	}
}
