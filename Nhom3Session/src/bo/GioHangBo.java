package bo;

import java.util.ArrayList;

import bean.GioHangBean;

public class GioHangBo {
	public ArrayList<GioHangBean> ds = new ArrayList<>();

	public void Them(String masach, String tensach, String tacgia, long soluong, long gia) {
		int count = -1;
		for (int i =0 ; i< ds.size(); i++) {
			if(ds.get(i).getMasach().equals(masach)) {
				count=i;
				break;
			}
		}
		if(count==-1) {
			GioHangBean gh = new GioHangBean(masach, tensach, tacgia, soluong, gia);
			ds.add(gh);
		} else {
			ds.get(count).setSoluong(ds.get(count).getSoluong()+1);
		}
		
	}
	
	public void thayDoiSoLuong(String masach, int soluong) {
		for(GioHangBean gh: ds) {
			if(gh.getMasach().equals(masach)) {
				gh.setSoluong(gh.getSoluong()+soluong);
				gh.setThanhtien();
			}
				
		}
	}
	
	public void xoa(String masach) {
		for(GioHangBean gh: ds) {
			if(gh.getMasach().equals(masach)) {
				ds.remove(gh);
				break;
			}
				
			
		}
	}

	public long tong() {
		long s=0;
		for(GioHangBean gh: ds) {
			s+=gh.getThanhtien();
		}
		return s;
	}
}
