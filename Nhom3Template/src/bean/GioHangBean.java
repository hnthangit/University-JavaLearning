package bean;

import java.util.List;

public class GioHangBean {
	private String masach;
	private String tensach;
	private String tacgia;
	private String anh;
	private long soluong;
	private long gia;
	private long thanhtien;
	public GioHangBean(String masach, String tensach, String tacgia, String anh , long soluong, long gia) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.anh = anh;
		this.soluong = soluong;
		this.gia = gia;
		this.thanhtien = soluong*gia;
	}
	public GioHangBean() {
		super();
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien() {
		this.thanhtien = soluong * gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
	
	
	
	
}
