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
		
		String userName = request.getParameter("username");//ȡ���û���
		String password = request.getParameter("password");//ȡ������
		nudbacDAO dbdao = new nudbacImpl();//�������ݿ����
		boolean canLogin = dbdao.loginSuccess(userName, password);
		if(canLogin){//���ݵ�½�������תҳ��
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