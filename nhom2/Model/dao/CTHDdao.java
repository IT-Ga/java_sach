package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CTHDdao {
	public void themcthd(String masach, Long soluongmua, int MaHD, String damua  )throws Exception {
		
		
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "insert into ChiTietHoaDon(MaSP,SoLuongMua,MaHoaDon,damua) values (?,?,?,?) ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, masach);
		cmd.setLong(2, soluongmua);
		cmd.setInt(3, MaHD);
		cmd.setString(4, damua);
		cmd.executeUpdate();
			
}
	public int maxhd() throws Exception{
		DungChung dc = new DungChung();
		dc.KetNoi();
		
		Statement st=dc.cn.createStatement();
		ResultSet rs = st.executeQuery("select max(MaHoaDon)from hoadon");
		int id2 = -1;
		if (rs.next()) {
		   id2 = rs.getInt(1);  
		}
		return id2;
	}
public void xacnhancthd(String pid,String damua)throws Exception {
		
		
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "update ChiTietHoaDon set damua=? where MaChiTietHD=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, damua);
		cmd.setString(2, pid);
		cmd.executeUpdate();
			
}
public void xoacthd(String id) throws Exception{
	DungChung dc = new DungChung();
	dc.KetNoi();
	String sql = "delete from ChiTietHoaDon where MaChiTietHD=? ";
	PreparedStatement cmd = dc.cn.prepareStatement(sql);
	cmd.setString(1, id);
	cmd.executeUpdate();
}
}
