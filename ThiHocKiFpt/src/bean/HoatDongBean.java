package bean;

import java.util.Date;

public class HoatDongBean {
	private int mahd;
	private String tenhd;
	private String motahd;
	private Date ngaygiobd;
	private Date ngaygiokt;
	private int sltoithieuyc;
	private int sltoidayc;
	private Date thoihandk;
	private String trangthai;
	private int matv;
	private String lydohuyhd;
	
	
	
	public HoatDongBean(int mahd, String tenhd, String motahd, Date ngaygiobd, Date ngaygiokt, int sltoithieuyc,
			int sltoidayc, Date thoihandk, String trangthai, int matv, String lydohuyhd) {
		super();
		this.mahd = mahd;
		this.tenhd = tenhd;
		this.motahd = motahd;
		this.ngaygiobd = ngaygiobd;
		this.ngaygiokt = ngaygiokt;
		this.sltoithieuyc = sltoithieuyc;
		this.sltoidayc = sltoidayc;
		this.thoihandk = thoihandk;
		this.trangthai = trangthai;
		this.matv = matv;
		this.lydohuyhd = lydohuyhd;
	}



	public int getMahd() {
		return mahd;
	}



	public void setMahd(int mahd) {
		this.mahd = mahd;
	}



	public String getTenhd() {
		return tenhd;
	}



	public void setTenhd(String tenhd) {
		this.tenhd = tenhd;
	}



	public String getMotahd() {
		return motahd;
	}



	public void setMotahd(String motahd) {
		this.motahd = motahd;
	}



	public Date getNgaygiobd() {
		return ngaygiobd;
	}



	public void setNgaygiobd(Date ngaygiobd) {
		this.ngaygiobd = ngaygiobd;
	}



	public Date getNgaygiokt() {
		return ngaygiokt;
	}



	public void setNgaygiokt(Date ngaygiokt) {
		this.ngaygiokt = ngaygiokt;
	}



	public int getSltoithieuyc() {
		return sltoithieuyc;
	}



	public void setSltoithieuyc(int sltoithieuyc) {
		this.sltoithieuyc = sltoithieuyc;
	}



	public int getSltoidayc() {
		return sltoidayc;
	}



	public void setSltoidayc(int sltoidayc) {
		this.sltoidayc = sltoidayc;
	}



	public Date getThoihandk() {
		return thoihandk;
	}



	public void setThoihandk(Date thoihandk) {
		this.thoihandk = thoihandk;
	}



	public String getTrangthai() {
		return trangthai;
	}



	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}



	public int getMatv() {
		return matv;
	}



	public void setMatv(int matv) {
		this.matv = matv;
	}



	public String getLydohuyhd() {
		return lydohuyhd;
	}



	public void setLydohuyhd(String lydohuyhd) {
		this.lydohuyhd = lydohuyhd;
	}



	public HoatDongBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
