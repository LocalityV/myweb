package javabean;

public interface nudbacDAO {
	public boolean loginSuccess(String userName,String password);
	public boolean signin(NormalUser auser);
	public  void createMLtable(String mlname);
		
}
