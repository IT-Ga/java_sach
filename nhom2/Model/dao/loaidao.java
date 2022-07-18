package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import bean.loaibean;



public class loaidao {
	public ArrayList<loaibean> getloai() throws Exception{
		ArrayList<loaibean> ds=new ArrayList<loaibean>();
		DungChung dc= new DungChung();
		dc.KetNoi();
	
		String sql="Select * from QLLoaiSanPham";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		ResultSet rs=cmd.executeQuery();
		
		while (rs.next()) {
			int MaLoaiSanPham=rs.getInt("MaLoaiSanPham");
			String TenLoaiSanPham=rs.getString("TenLoaiSanPham");
			ds.add(new loaibean(MaLoaiSanPham, TenLoaiSanPham));
		}

		rs.close();
		dc.cn.close();
		return ds;
		
	}
	public void ThemLoai( String cname) throws Exception
	{
		//b1: ket noi vao csdl
		DungChung dc=new DungChung();
		dc.KetNoi();
		
			String sql="insert into QLLoaiSanPham (TenLoaiSanPham) values (?)";
			PreparedStatement cmd=dc.cn.prepareStatement(sql);
			cmd.setString(1,cname);
			//b4: Thuc hien cau lieu
			cmd.executeUpdate();
		
	}	
public loaibean loadloai(String id) throws Exception{
		
		//B1: káº¿t ná»‘i
				DungChung dc = new DungChung();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from QLLoaiSanPham where MaLoaiSanPham=?";
				PreparedStatement cmd = dc.cn.prepareStatement(sql);
				//Truyá»�n 01 tham sá»‘: un; pas vÃ o cmd
				cmd.setString(1, id);
				ResultSet rs = cmd.executeQuery();
				//Náº¿u rs.next==false return null
				// else: return kh;
					// Táº¡o ra 1 khachhang:kh vÃ  return kh;
				while (rs.next()) 
			 {
					int MaLoaiSanPham=rs.getInt("MaLoaiSanPham");
		    		String TenLoaiSanPham=rs.getString("TenLoaiSanPham");
		    		
		    		loaibean kh=new loaibean(MaLoaiSanPham, TenLoaiSanPham);
		    		rs.close();
			    	dc.cn.close();
		    		return kh;
				}
				return null;
		    	//Dong ket noi	
	}
	public void SuaLoai(String id,String name) throws Exception
	{
		//b1: ket noi vao csdl
		DungChung dc=new DungChung();
		dc.KetNoi();
		
			String sql="update QLLoaiSanPham set TenLoaiSanPham=? where MaLoaiSanPham=?";
			PreparedStatement cmd=dc.cn.prepareStatement(sql);
			cmd.setString(1,name);
			cmd.setString(2,id);
			
			//b4: Thuc hien cau lieu
			cmd.executeUpdate();
		
	}
	public void xoaLoai(long id) throws Exception{
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql1 = "delete from QLSanPham where MaLoaiSanPham=? ";
		PreparedStatement cmd1 = dc.cn.prepareStatement(sql1);
		cmd1.setLong(1, id);
		String sql = "delete from QLLoaiSanPham where MaLoaiSanPham=? ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setLong(1, id);
		cmd.executeUpdate();
	}
}
