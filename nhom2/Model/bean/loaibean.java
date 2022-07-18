package bean;

public class loaibean {
	private int MaLoaiSanPham;
	private String TenLoaiSanPham;
	public loaibean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loaibean(int maLoaiSanPham, String tenLoaiSanPham) {
		super();
		this.MaLoaiSanPham = maLoaiSanPham;
		this.TenLoaiSanPham = tenLoaiSanPham;
	}
	public int getMaLoaiSanPham() {
		return MaLoaiSanPham;
	}
	public void setMaLoaiSanPham(int maLoaiSanPham) {
		MaLoaiSanPham = maLoaiSanPham;
	}
	public String getTenLoaiSanPham() {
		return TenLoaiSanPham;
	}
	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		TenLoaiSanPham = tenLoaiSanPham;
	}
	
}
