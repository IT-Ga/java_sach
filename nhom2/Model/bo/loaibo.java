package bo;

import java.util.ArrayList;

import bean.loaibean;
import dao.loaidao;

public class loaibo {
	loaidao ldao= new loaidao();
	public ArrayList<loaibean> getloai() throws Exception{
		return ldao.getloai();
	}
	public void ThemLoai( String cname) throws Exception
	{
		ldao.ThemLoai(cname);
	}
	public loaibean loadloai(String id) throws Exception{
		return ldao.loadloai(id);
	}
	public void SuaLoai(String id,String name) throws Exception
	{ ldao.SuaLoai(id, name);}
	public void xoaLoai(long id) throws Exception{
		ldao.xoaLoai(id);
	}
}
