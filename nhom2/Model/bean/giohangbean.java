package bean;

public class giohangbean {
	private String MaSP;
    private String TenSanPham;
    private String Anh;
    private Long gia;
    private Long slmua;
    private Long thanhtien;
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giohangbean(String maSP, String tenSanPham, String anh, Long gia, Long slmua) {
		super();
		this.MaSP = maSP;
		this.TenSanPham = tenSanPham;
		this.Anh = anh;
		this.gia = gia;
		this.slmua = slmua;
		this.thanhtien = slmua*gia;
	}
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		this.MaSP = maSP;
	}
	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.TenSanPham = tenSanPham;
	}
	public String getAnh() {
		return Anh;
	}
	public void setAnh(String anh) {
		this.Anh = anh;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public Long getSlmua() {
		return slmua;
	}
	public void setSlmua(Long slmua) {
		this.slmua = slmua;
	}
	public Long getThanhtien() {
		return slmua*gia;
	}
	public void setThanhtien(Long thanhtien) {
		this.thanhtien = thanhtien;
	}
    
}
