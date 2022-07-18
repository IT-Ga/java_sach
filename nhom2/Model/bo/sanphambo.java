package bo;

import java.util.ArrayList;


import bean.sanphambean;
import dao.sanphamdao;

public class sanphambo {
	sanphamdao spdao= new sanphamdao();

	public ArrayList<sanphambean> getsach() throws Exception{
		return spdao.getsach();
}
	public ArrayList<sanphambean> TimMaLoai(ArrayList<sanphambean> ds, long maloai){
		ArrayList<sanphambean> tam= new ArrayList<sanphambean>();
		for (sanphambean sv:ds)
			if(sv.getMaLoaiSanPham()==maloai)
				tam.add(sv);
		return tam;
	
	}
	public ArrayList<sanphambean> Tim(ArrayList<sanphambean> ds, String key){
    	ArrayList<sanphambean> tam= new ArrayList<sanphambean>();
    	for(sanphambean sv: ds)
    		if(sv.getTenSanPham().toLowerCase().contains(key.toLowerCase()))
    			tam.add(sv);
    	return tam;
 	
	}
	public void ThemSach(String name, String anh, Long gia,String maloai) throws Exception
	{ spdao.ThemSach(name, anh, gia, maloai);}
	public sanphambean loadsp(String id) throws Exception{
		return spdao.loadsp(id);
	}
	public void SuaSach(String id,String name, String anh, Long gia,String maloai) throws Exception
	{
		spdao.SuaSach(id, name, anh, gia, maloai);
	}
	public void xoaSP(long id) throws Exception{
		spdao.xoaSP(id);
	}
}
