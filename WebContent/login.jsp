<%@ page language="java" contentType="text/html; charset=gb2312"
pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="login.jpeg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>登陆页面</title>
<style type="text/css">
span {color:white}
</style>
</head>
<body>
<br><br><br><br><br><br><br><br><br><br><br>
<center> <span>登录您的MMS账号</span> </center><br>
<center>
<form action="login" method="post">
<span>用户名</span> <input type="text" name = "username" /> <br><br>
<span>密码 &nbsp;&nbsp;</span><input type="password" name = "password"> <br><br>
<input type = "submit" value = "登录">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="signin.jsp"><span>注册</span></a><br><br>
</form>
</center>
</body>
</html>
