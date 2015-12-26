package javabean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MailClass {
		private String className;
		private String MailListName;
		public String getMailListName() {
			return MailListName;
		}
		public void setMailListName(String mailListName) {
			MailListName = mailListName;
		}
		//constructor
		public MailClass(){}		
		public MailClass(String cname){
			className=cname;
			MailListName=className+"L";
			createCMailList();
			}
		
		private void createCMailList(){
			Connection conn=DBUtil.initJDBC();
			String sql="create table "+this.className+"("
					+ "mailid BIGINT auto_increment primary key,"
					+ "senderEmail char(40) not null,"
					+ "mailTitle char(60) not null,"
					+ "text TEXT(3000) not null"
					+ ")";
			try {
				Statement stmt=conn.createStatement();
				stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			//this.className = className;
		}
		
		//is garbage class£¿
		public boolean isgarbage(){
			return className.equals("garbage");
		}
		
}
