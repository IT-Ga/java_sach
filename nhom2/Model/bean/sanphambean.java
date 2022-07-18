package bean;

public class sanphambean {
	private int MaSP;
	private String TenSanPham;
	private int MaLoaiSanPham;
	private String GiaCa;
	private String Anh;
	public sanphambean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sanphambean(int maSP, String tenSanPham, int maLoaiSanPham, String giaCa, String anh) {
		super();
		this.MaSP = maSP;
		this.TenSanPham = tenSanPham;
		this.MaLoaiSanPham = maLoaiSanPham;
		this.GiaCa = giaCa;
		this.Anh = anh;
	}
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		this.MaSP = maSP;
	}
	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.TenSanPham = tenSanPham;
	}
	public int getMaLoaiSanPham() {
		return MaLoaiSanPham;
	}
	public void setMaLoaiSanPham(int maLoaiSanPham) {
		this.MaLoaiSanPham = maLoaiSanPham;
	}
	public String getGiaCa() {
		return GiaCa;
	}
	public void setGiaCa(String giaCa) {
		this.GiaCa = giaCa;
	}
	public String getAnh() {
		return Anh;
	}
	public void setAnh(String anh) {
		this.Anh = anh;
	}
	
}
