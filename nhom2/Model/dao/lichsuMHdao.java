package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.lichsuMHbean;


public class lichsuMHdao {
public ArrayList<lichsuMHbean> getls(long makh) throws Exception{
		
	
	   	
		ArrayList<lichsuMHbean> ds=new ArrayList<lichsuMHbean>();
		//B1: kết nối
		DungChung dc = new DungChung();
		dc.KetNoi();
		//b2: lay du lieu ve
		String sql = "select * from View_1\r\n"
				+ "where ID=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setLong(1, makh);
		ResultSet rs = cmd.executeQuery();
		//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
		while(rs.next()) {
    		long ID=rs.getLong("ID");
    		String HoTen=rs.getString("HoTen");
    		String TenSanPham=rs.getString("TenSanPham");
    		int SoLuongMua=rs.getInt("SoLuongMua");
    		int GiaCa=rs.getInt("GiaCa");
    		int ThanhTien=rs.getInt("ThanhTien");
    		int damua=rs.getInt("damua");
    		ds.add(new lichsuMHbean(ID, HoTen, TenSanPham, SoLuongMua, GiaCa, ThanhTien, damua));
    	}
    	//Dong ket noi
    	rs.close();
    	dc.cn.close();
 
    	 return ds;
	}
public ArrayList<lichsuMHbean> getls() throws Exception{
	
	
   	
	ArrayList<lichsuMHbean> ds=new ArrayList<lichsuMHbean>();
	//B1: kết nối
	DungChung dc = new DungChung();
	dc.KetNoi();
	//b2: lay du lieu ve
	String sql = "select * from View_1\r\n";
			
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	ResultSet rs = cmd.executeQuery();
	//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
	while(rs.next()) {
		long MaChiTietHD=rs.getLong("MaChiTietHD");
		String HoTen=rs.getString("HoTen");
		String TenSanPham=rs.getString("TenSanPham");
		int SoLuongMua=rs.getInt("SoLuongMua");
		int GiaCa=rs.getInt("GiaCa");
		int ThanhTien=rs.getInt("ThanhTien");
		int damua=rs.getInt("damua");
		ds.add(new lichsuMHbean(MaChiTietHD, HoTen, TenSanPham, SoLuongMua, GiaCa, ThanhTien, damua));
	}
	//Dong ket noi
	rs.close();
	dc.cn.close();

	 return ds;
}
}
