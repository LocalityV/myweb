package javabean;
import java.sql.*;

public class DBUtil {
	boolean bInited = false;
	//加载驱动
	private static String Driver;
	private static String Url;
	private static String MysqlId;
	private static String MysqlPwd;
	
	static {
		Driver="com.mysql.jdbc.Driver";
		Url="jdbc:mysql://localhost:3306/SMMDB";
		MysqlId="root";
		MysqlPwd="0210";
	}
	
	//链接初始化MYSQL数据库
	public  static Connection initJDBC()   {
		//加载MYSQL JDBC驱动程序
		try {
			Class.forName(Driver);
			System.out.println("Success loading Mysql Driver!");
			return DriverManager.getConnection(Url,MysqlId,MysqlPwd);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;

	}
	
	
	
	//关闭MYSQL数据库
	public static void doClose(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}



