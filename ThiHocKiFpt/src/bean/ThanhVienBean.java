package bean;

import java.util.Date;

public class ThanhVienBean {
	private int matv;
	private String hoten;
	private int gioitinh;
	private Date ngaysinh;
	private String diachiemail;
	private String sodienthoai;
	
	
	
	public ThanhVienBean(int matv, String hoten, int gioitinh, Date ngaysinh, String diachiemail, String sodienthoai) {
		super();
		this.matv = matv;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachiemail = diachiemail;
		this.sodienthoai = sodienthoai;
	}
	public ThanhVienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMatv() {
		return matv;
	}
	public void setMatv(int matv) {
		this.matv = matv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachiemail() {
		return diachiemail;
	}
	public void setDiachiemail(String diachiemail) {
		this.diachiemail = diachiemail;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	
	
}
