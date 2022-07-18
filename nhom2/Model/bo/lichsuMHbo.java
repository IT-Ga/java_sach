package bo;

import java.util.ArrayList;

import bean.lichsuMHbean;

import dao.lichsuMHdao;


public class lichsuMHbo {
	lichsuMHdao sdao = new lichsuMHdao();
	public ArrayList<lichsuMHbean> getlsMH(long makh) throws Exception{
		return sdao.getls(makh);
	}
	public ArrayList<lichsuMHbean> getlsMH() throws Exception{
		return sdao.getls();
	}
}
