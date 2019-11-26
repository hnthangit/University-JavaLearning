package bean;

import java.util.Date;

public class ThamGiaBean {
	private int matv;
	private int mahd;
	private Date ngaygiodangky;
	private int diemtruongdoan;
	private int diemtieuchi1;
	private int diemtieuchi2;
	private int diemtieuchi3;
	private String nhanxetkhac;
	
	
	
	public ThamGiaBean(int matv, int mahd, Date ngaygiodangky, int diemtruongdoan, int diemtieuchi1, int diemtieuchi2,
			int diemtieuchi3, String nhanxetkhac) {
		super();
		this.matv = matv;
		this.mahd = mahd;
		this.ngaygiodangky = ngaygiodangky;
		this.diemtruongdoan = diemtruongdoan;
		this.diemtieuchi1 = diemtieuchi1;
		this.diemtieuchi2 = diemtieuchi2;
		this.diemtieuchi3 = diemtieuchi3;
		this.nhanxetkhac = nhanxetkhac;
	}
	public ThamGiaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMatv() {
		return matv;
	}
	public void setMatv(int matv) {
		this.matv = matv;
	}
	public int getMahd() {
		return mahd;
	}
	public void setMahd(int mahd) {
		this.mahd = mahd;
	}
	public Date getNgaygiodangky() {
		return ngaygiodangky;
	}
	public void setNgaygiodangky(Date ngaygiodangky) {
		this.ngaygiodangky = ngaygiodangky;
	}
	public int getDiemtruongdoan() {
		return diemtruongdoan;
	}
	public void setDiemtruongdoan(int diemtruongdoan) {
		this.diemtruongdoan = diemtruongdoan;
	}
	public int getDiemtieuchi1() {
		return diemtieuchi1;
	}
	public void setDiemtieuchi1(int diemtieuchi1) {
		this.diemtieuchi1 = diemtieuchi1;
	}
	public int getDiemtieuchi2() {
		return diemtieuchi2;
	}
	public void setDiemtieuchi2(int diemtieuchi2) {
		this.diemtieuchi2 = diemtieuchi2;
	}
	public int getDiemtieuchi3() {
		return diemtieuchi3;
	}
	public void setDiemtieuchi3(int diemtieuchi3) {
		this.diemtieuchi3 = diemtieuchi3;
	}
	public String getNhanxetkhac() {
		return nhanxetkhac;
	}
	public void setNhanxetkhac(String nhanxetkhac) {
		this.nhanxetkhac = nhanxetkhac;
	}
	
	
}
