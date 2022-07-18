package bo;



import java.util.ArrayList;

import bean.taikhoanbean;
import dao.taikhoandao;

public class taikhoanbo {
	taikhoandao tkdao= new taikhoandao();
	public taikhoanbean getkh(String un,String pass) throws Exception{
		return tkdao.getkh(un, pass);
	}
	public taikhoanbean ktdn(String makh, String matkhau) throws Exception
	   {
	    	return tkdao.getkh(makh, matkhau);
	   }
	public void getkh(String hoten,String diachi, String un,String pass) throws Exception{
	    tkdao.dangky(hoten, diachi, un, pass);
	    }
   
   public taikhoanbean ktkh(String makh) throws Exception
   {
    	return tkdao.ktkh(makh);
   }
   public ArrayList<taikhoanbean> htKH() throws Exception{
	   return tkdao.htKH();
   }
}
