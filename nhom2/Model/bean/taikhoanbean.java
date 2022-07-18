package bean;

public class taikhoanbean {
	private int ID;
	private String HoTen;
	private String DiaChi;
	private String TenDangNhap;
	private String MatKhau;
	private int GhiChu;
	public taikhoanbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public taikhoanbean(int iD, String hoTen, String diaChi, String tenDangNhap, String matKhau, int ghiChu) {
		super();
		this.ID = iD;
		this.HoTen = hoTen;
		this.DiaChi = diaChi;
		this.TenDangNhap = tenDangNhap;
		this.MatKhau = matKhau;
		this.GhiChu = ghiChu;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		this.HoTen = hoTen;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		this.MatKhau = matKhau;
	}
	public int getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(int ghiChu) {
		this.GhiChu = ghiChu;
	}
	
}
