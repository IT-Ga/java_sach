package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public Connection cn;
	public void KetNoi() throws Exception{
		
		//b1: Xac dinh HQTCSDL
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	System.out.println("Da xac dinh");
    	String url="jdbc:sqlserver://DESKTOP-12J6D6C\\SQLEXPRESS:1433;databaseName=LAPTOP;user=sa; password=123";
    	cn= DriverManager.getConnection(url);
    	System.out.println("Da ket noi");
	}
}
