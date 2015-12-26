package javabean;
import java.sql.*;

public class DBUtil {
	boolean bInited = false;
	//��������
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
	
	//���ӳ�ʼ��MYSQL���ݿ�
	public  static Connection initJDBC()   {
		//����MYSQL JDBC��������
		try {
			Class.forName(Driver);
			System.out.println("Success loading Mysql Driver!");
			return DriverManager.getConnection(Url,MysqlId,MysqlPwd);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;

	}
	
	
	
	//�ر�MYSQL���ݿ�
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



