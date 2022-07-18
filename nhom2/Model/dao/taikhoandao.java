package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import bean.taikhoanbean;



public class taikhoandao {
public taikhoanbean getkh(String un,String pass) throws Exception{
		
		//B1: káº¿t ná»‘i
				DungChung dc = new DungChung();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from QLTaiKhoan where TenDangNhap=? and MatKhau=?";
				PreparedStatement cmd = dc.cn.prepareStatement(sql);
				//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
				cmd.setString(1, un);
				cmd.setString(2, pass);
				ResultSet rs = cmd.executeQuery();
				//Náº¿u rs.next==false return null
				// else: return kh;
					// Táº¡o ra 1 khachhang:kh vÃ  return kh;
				if (rs.next()==false) return null;
				else {
					
					int ID=rs.getInt("ID");
		    		String HoTen=rs.getString("HoTen");
		    		String DiaChi=rs.getString("DiaChi");
		    		String TenDangNhap=rs.getString("TenDangNhap");
		    		String MatKhau=rs.getString("MatKhau");
		    		int GhiChu=rs.getInt("GhiChu");
		    		taikhoanbean kh=new taikhoanbean(ID, HoTen, DiaChi, TenDangNhap, MatKhau, GhiChu);
		    		rs.close();
			    	dc.cn.close();
		    		return kh;
					}
		    	//Dong ket noi	
	}
public taikhoanbean ktkh(String un) throws Exception{
	
	//B1: káº¿t ná»‘i
			DungChung dc = new DungChung();
			dc.KetNoi();
			//b2: lay du lieu ve
			String sql = "Select * from QLTaiKhoan where TenDangNhap=? ";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
			cmd.setString(1, un);
			ResultSet rs = cmd.executeQuery();
			//Náº¿u rs.next==false return null
			// else: return kh;
				// Táº¡o ra 1 khachhang:kh vÃ  return kh;
			while (rs.next()) 
		 {
				
				int ID=rs.getInt("ID");
	    		String HoTen=rs.getString("HoTen");
	    		String DiaChi=rs.getString("DiaChi");
	    		String TenDangNhap=rs.getString("TenDangNhap");
	    		String MatKhau=rs.getString("MatKhau");
	    		int GhiChu=rs.getInt("GhiChu");
	    		taikhoanbean kh=new taikhoanbean(ID, HoTen, DiaChi, TenDangNhap, MatKhau, GhiChu);
	    		rs.close();
		    	dc.cn.close();
	    		return kh;
			}
			return null;
	    	//Dong ket noi	
}

public void dangky(String hoten,String diachi,String un,String pass )throws Exception {
	
	
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "insert into QLTaiKhoan values (?,?,?,?,?) ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, hoten);
		cmd.setString(2, diachi);
		cmd.setString(3, un);
		cmd.setString(4, pass);
		cmd.setInt(5, 1);
		cmd.executeUpdate();
	
	
}
public ArrayList<taikhoanbean> htKH() throws Exception{
	
	
   	
	ArrayList<taikhoanbean> ds=new ArrayList<taikhoanbean>();
	//B1: káº¿t ná»‘i
	DungChung dc = new DungChung();
	dc.KetNoi();
	//b2: lay du lieu ve
	String sql = "Select *from QLTaiKhoan";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	ResultSet rs = cmd.executeQuery();
	//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
	while(rs.next()) {
		int ID=rs.getInt("ID");
		//String makh1=Integer.toString(makh);
		String HoTen=rs.getString("HoTen");
		String DiaChi=rs.getString("DiaChi");
		String TenDangNhap=rs.getString("TenDangNhap");
		String MatKhau=rs.getString("MatKhau");
		int GhiChu=rs.getInt("GhiChu");
		ds.add(new taikhoanbean(ID, HoTen, DiaChi, TenDangNhap, MatKhau, GhiChu));
	}
	//Dong ket noi
	rs.close();
	dc.cn.close();

	 return ds;
}
public void suaKH (String hoten,String diachi,String sodt,String email,String tendn,String pass,long makh) throws Exception{
DungChung dc = new DungChung();
dc.KetNoi();
String sql = "update  KhachHang" 
		+ "set hoten=?, diachi=?, sodt=?,email=?,tendn=?,pass=?"
		+ " where makh=? ";
		
PreparedStatement cmd = dc.cn.prepareStatement(sql);

cmd.setString(1, hoten);
cmd.setString(2, diachi);
cmd.setString(3, sodt);
cmd.setString(4, email);
cmd.setString(5, tendn);
cmd.setString(6, pass);
cmd.setLong(7, makh);
cmd.executeUpdate();
}
public void xoaKH(long makh) throws Exception{
	DungChung dc = new DungChung();
	dc.KetNoi();
	String sql = "delete from KhachHang where makh=? ";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	cmd.setLong(1, makh);
	cmd.executeUpdate();
}


}

