package javabean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class nudbacImpl implements nudbacDAO {
	
	/*对normaluser表的操作，包括注册和验证登录*/
	public boolean loginSuccess(String userName, String password) {	
		boolean returnValue = false;
		String sql = "SELECT * FROM normaluser";
		Connection conn=DBUtil.initJDBC();
		Statement stmt = null;
		ResultSet rs = null;

		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String userNameInDB = rs.getString("username");
				String passwordInDB = rs.getString("password");
				if(userNameInDB.equals(userName) &&
						passwordInDB.equals(password)){
					returnValue = true;
					System.out.println(returnValue);
					break;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.doClose(conn);
		}

		return returnValue;

	}
		

	public boolean signin(NormalUser auser) {
		Connection conn=DBUtil.initJDBC();
		if(!isinusrDB(auser.getUsername(),conn)){
			addUsr(auser,conn);
			return true;
		}
		else return false;
		
		}
	
	
	public static boolean isinusrDB(String userName,Connection conn) {	
		boolean returnValue = false;
		String sql = "SELECT username FROM NormalUser";
		try{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String userNameInDB = rs.getString("username");
				if(userNameInDB.equals(userName) ){
					returnValue = true;
					break;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return returnValue;

	}
	
	public static void addUsr(NormalUser auser,Connection conn){
		String sql="insert into NormalUser "
				+ "(username,nikname,password,sex,MailClassList,SubUsrList)"
				+ "values"
				+ "(?,?,?,?,?,?)";
		
		try {
			PreparedStatement prestmt=conn.prepareStatement(sql);
			prestmt.setString(1, auser.getUsername());
			prestmt.setString(2, auser.getNikname());
			prestmt.setString(3, auser.getPassword());
			prestmt.setString(4, auser.getSex());
			prestmt.setString(5,auser.getMailClassList());
			prestmt.setString(6,auser.getSubUsrList());
			prestmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*对用户邮箱组别表的操作，主要是创建一个邮箱组别，以及加入默认组别*/
	public void createMLtable(String mlname){
		Connection conn=DBUtil.initJDBC();
		//create a new MLtable
		String sql1="create table "+mlname+"("
				+ "className char(30) not null primary key,"
				+ "MailListName char(30) not null"				
				+ ")";
		try {
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(sql1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//create default class 
		MailClass unread=new MailClass("UnRead");
		MailClass alread=new MailClass("AlRead");
		MailClass Garbage=new MailClass("Garbage");
		mcinsert(conn,unread,mlname);
		mcinsert(conn,alread,mlname);
		mcinsert(conn,Garbage,mlname);
	}
	
	public static void mcinsert(Connection conn,MailClass ac,String mlname){
		String sql2="insert into"+mlname
				+ "values(?,?)";
		
		try {
			PreparedStatement stmt=conn.prepareStatement(sql2);
			stmt.setString(1, ac.getClassName());
			stmt.setString(2, ac.getMailListName());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**/

}
