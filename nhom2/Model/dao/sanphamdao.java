package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import bean.sanphambean;
import bo.sanphambo;

public class sanphamdao {
public ArrayList<sanphambean> getsach() throws Exception{
		
	
	   	
		ArrayList<sanphambean> ds=new ArrayList<sanphambean>();
		//B1: káº¿t ná»‘i
		DungChung dc = new DungChung();
		dc.KetNoi();
		//b2: lay du lieu ve
		String sql = "Select *from QLSanPham";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
		while(rs.next()) {
    		int MaSP=rs.getInt("MaSP");
    		String TenSanPham=rs.getString("TenSanPham");
    		int MaLoaiSanPham=rs.getInt("MaLoaiSanPham");
    		String GiaCa=rs.getString("GiaCa");
    		String Anh=rs.getString("Anh");
    		ds.add(new sanphambean(MaSP, TenSanPham, MaLoaiSanPham, GiaCa, Anh));
    	}
    	//Dong ket noi
    	rs.close();
    	dc.cn.close();
 
    	 return ds;
	}
public sanphambean loadsp(String id) throws Exception{
	
	//B1: káº¿t ná»‘i
			DungChung dc = new DungChung();
			dc.KetNoi();
			//b2: lay du lieu ve
			String sql = "Select * from QLSanPham where MaSP=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
			cmd.setString(1, id);
			
			ResultSet rs = cmd.executeQuery();
			//Náº¿u rs.next==false return null
			// else: return kh;
				// Táº¡o ra 1 khachhang:kh vÃ  return kh;
			while (rs.next()) 
		 {
				int MaSP=rs.getInt("MaSP");
	    		String TenSanPham=rs.getString("TenSanPham");
	    		int MaLoaiSanPham=rs.getInt("MaLoaiSanPham");
	    		String GiaCa=rs.getString("GiaCa");
	    		String Anh=rs.getString("Anh");
	    		
	    		sanphambean kh=new sanphambean(MaSP, TenSanPham, MaLoaiSanPham, GiaCa, Anh);
	    		rs.close();
		    	dc.cn.close();
	    		return kh;
			}
			return null;
	    	//Dong ket noi	
}
public void ThemSach(String name, String anh, Long gia,String maloai) throws Exception
{
	//b1: ket noi vao csdl
	DungChung dc=new DungChung();
	dc.KetNoi();
	
		String sql="insert into QLSanPham (TenSanPham,Anh,GiaCa,MaLoaiSanPham) values (?,?,?,?)";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		cmd.setString(1,name);
		cmd.setString(2,anh);
		cmd.setLong(3,gia);
		cmd.setString(4,maloai);
		//b4: Thuc hien cau lieu
		cmd.executeUpdate();
	
}	
public void xoaSP(long id) throws Exception{
	DungChung dc = new DungChung();
	dc.KetNoi();
	String sql1 = "delete from ChiTietHoaDon where MaSP=? ";
	PreparedStatement cmd1 = dc.cn.prepareStatement(sql1);
	cmd1.setLong(1, id);
	String sql = "delete from QLSanPham where MaSP=? ";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	cmd.setLong(1, id);
	cmd.executeUpdate();
}
public void SuaSach(String id,String name, String anh, Long gia,String maloai) throws Exception
{
	//b1: ket noi vao csdl
	DungChung dc=new DungChung();
	dc.KetNoi();
	
		String sql="update QLSanPham set TenSanPham=?,Anh=?,GiaCa=?,MaLoaiSanPham=? where MaSP=?";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		cmd.setString(1,name);
		cmd.setString(2,anh);
		cmd.setLong(3,gia);
		cmd.setString(4,maloai);
		cmd.setString(5,id);
		//b4: Thuc hien cau lieu
		cmd.executeUpdate();
	
}

}
