package servlet;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javabean.nudbacDAO;
import javabean.nudbacImpl;
public class LoginServlet implements javax.servlet.Servlet{
	public void destroy() {

	}
	public ServletConfig getServletConfig() {
		return null;
	}
	public String getServletInfo() {
		return null;
	}
	public void init(ServletConfig arg0) throws ServletException {

	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		String userName = request.getParameter("username");//取得用户名
		String password = request.getParameter("password");//取得密码
		nudbacDAO dbdao = new nudbacImpl();//构建数据库对象
		boolean canLogin = dbdao.loginSuccess(userName, password);
		if(canLogin){//根据登陆情况，跳转页面
			response.sendRedirect("welcome.jsp");
		}else{
			response.sendRedirect("back.jsp");
		}
	}
	
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		HttpServletRequest rq = (HttpServletRequest)request;
		HttpServletResponse rs = (HttpServletResponse) response;
		doPost(rq,rs);
	}

}