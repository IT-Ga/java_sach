package bo;

import java.sql.Date;

import dao.CTHDdao;
import dao.hoadondao;

public class CTHDbo {
	CTHDdao khdao= new CTHDdao();
	public void getcthd(String masach, Long soluongmua, int MaHD, String damua ) throws Exception{
		    khdao.themcthd(masach, soluongmua, MaHD, damua);
   }
	public int maxhd() throws Exception {
		return khdao.maxhd();
		
	}
	public void xacnhancthd(String pid,String damua)throws Exception {
		khdao.xacnhancthd(pid, damua);
	}
	public void xoacthd(String pid) throws Exception{
		khdao.xoacthd(pid);
	}
}
