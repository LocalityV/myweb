package servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.NormalUser;
import javabean.nudbacDAO;
import javabean.nudbacImpl;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName = request.getParameter("username");//取得用户名
		String nikName = request.getParameter("nikname");//取得昵称
		String passWord = request.getParameter("password");//取得密码
		String passWordEnsure = request.getParameter("passwordEnsure");//取得密码
		String Sex=request.getParameter("sex");//取得性别
		NormalUser auser=new NormalUser(userName,nikName,passWord,Sex);
		
		nudbacDAO dbdao = new nudbacImpl();//构建数据库对象
		boolean canLogin = dbdao.signin(auser);
		if(canLogin){//根据登陆情况，跳转页面
			response.sendRedirect("welcome.jsp");
		}else{
			response.sendRedirect("usrnameexc.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
