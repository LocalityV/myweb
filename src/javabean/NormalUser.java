package javabean;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class NormalUser {
	//members
	private String username;
	private String nikname;
	private String password;
	private String sex;
	private String MailClassList;
	private String SubUsrList;
	
	//constructor
	public NormalUser(String uname,String niname,String pwd,String sx){
		username=uname;
		nikname=niname;
		password=pwd;
		sex=sx;
		MailClassList=username+"ML";
		SubUsrList=username+"sub";
		nudbacDAO tmp=new nudbacImpl();
		tmp.createMLtable(MailClassList);
		
	}
	
	
	
	
	
	//default constructor
	NormalUser(){}
	
	//access members
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMailClassList() {
		return MailClassList;
	}
	public void setMailClassList(String mailClassList) {
		MailClassList = mailClassList;
	}
	public String getSubUsrList() {
		return SubUsrList;
	}
	public void setSubUsrList(String subUsrList) {
		SubUsrList = subUsrList;
	}
	

}
