package bean;

public class lichsuMHbean {
	private long ID;
	private String HoTen;
	private String TenSanPham;
	private int  SoLuongMua;
	private int GiaCa;
	private int ThanhTien;
	private int damua;
	public lichsuMHbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsuMHbean(long iD, String hoTen, String tenSanPham, int soLuongMua, int giaCa, int thanhTien, int damua) {
		super();
		this.ID = iD;
		this.HoTen = hoTen;
		this.TenSanPham = tenSanPham;
		this.SoLuongMua = soLuongMua;
		this.GiaCa = giaCa;
		this.ThanhTien = thanhTien;
		this.damua = damua;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		this.ID = iD;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		this.HoTen = hoTen;
	}
	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.TenSanPham = tenSanPham;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.SoLuongMua = soLuongMua;
	}
	public int getGiaCa() {
		return GiaCa;
	}
	public void setGiaCa(int giaCa) {
		this.GiaCa = giaCa;
	}
	public int getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.ThanhTien = thanhTien;
	}
	public int getDamua() {
		return damua;
	}
	public void setDamua(int damua) {
		this.damua = damua;
	}
	
	
}
