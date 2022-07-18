package bean;

public class CTHDbean {
	private int MaChiTietHD;
	private String MaSach;
	private int SoLuongMua;
	private int MaHoaDon;
	private String DaMua;
	public CTHDbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CTHDbean(int maChiTietHD, String maSach, int soLuongMua, int maHoaDon, String daMua) {
		super();
		this.MaChiTietHD = maChiTietHD;
		this.MaSach = maSach;
		this.SoLuongMua = soLuongMua;
		this.MaHoaDon = maHoaDon;
		this.DaMua = daMua;
	}
	public int getMaChiTietHD() {
		return MaChiTietHD;
	}
	public void setMaChiTietHD(int maChiTietHD) {
		MaChiTietHD = maChiTietHD;
	}
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public int getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public String getDaMua() {
		return DaMua;
	}
	public void setDaMua(String daMua) {
		DaMua = daMua;
	}
	
	
}
