package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Calendar;

import bean.hoadonbean;

public class hoadondao {
	public void themhd(int makh, Date ngayMua, String damua )throws Exception {
		
		
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "insert into hoadon values (?,?,?) ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setInt(1, makh);
		cmd.setDate(2, ngayMua);
		cmd.setString(3, damua);
		cmd.executeUpdate();
			
}
}
