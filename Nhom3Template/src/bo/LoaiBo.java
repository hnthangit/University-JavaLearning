package bo;

import java.util.ArrayList;

import bean.LoaiBean;
import dao.LoaiDao;

public class LoaiBo {
	LoaiDao loaidao = new LoaiDao();
	
	public ArrayList<LoaiBean> getListLoai() throws Exception{
		return loaidao.getListLoai();
	}
	
}
