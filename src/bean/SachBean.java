package bean;

public class SachBean {
	private String masach;
	private String tensach;
	private String tacgiac;
	private Long gia;
	private String anh;
	public SachBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SachBean(String masach, String tensach, String tacgiac, Long gia, String anh) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.tacgiac = tacgiac;
		this.gia = gia;
		this.anh = anh;
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
	public String getTacgiac() {
		return tacgiac;
	}
	public void setTacgiac(String tacgiac) {
		this.tacgiac = tacgiac;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
