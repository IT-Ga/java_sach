package bo;

import java.sql.Date;
import java.util.ArrayList;

import bean.hoadonbean;
import dao.hoadondao;


public class hoadonbo {
	hoadondao khdao= new hoadondao();
	public void gethd(int makh, Date NgayMua, String damua) throws Exception{
		    khdao.themhd( makh, NgayMua, damua);;
   }
	
}
