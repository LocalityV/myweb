<%@ page language="java" contentType="text/html; charset=gb2312"
   pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="register.jpg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册界面</title>
<style type="text/css">
span {color:white}
</style>
</head>
<body>
<br><br><br><br><br><br><br><br>

<script>
function checkSame(){
var pass1=document.getElementById("keyFirst").value;
var pass2=document.getElementById("keySecond").value;
var x=document.getElementById("wrongMessage");
if(pass1!=pass2)
{
x.innerHTML="<br><br>两次输入密码不一致";
return false;
}
x.innerHTML="";
return true;

}
</script>

<center> <span>注册您的MMS账户</span> </center><br>
<center>
<form action="signin" method="post">
<span>用户名</span>&nbsp;&nbsp;
<input type="text" name = "username" /><br><br>
<span>密码</span>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="password" name = "password" id="keyFirst"> <br><br>
<span>密码确认</span>
<input type="password" name = "passwordEnsure" id="keySecond"> 
<span id="wrongMessage"></span><br><br>
<span>昵称</span>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name = "nikname"> <br><br>
<span>性别</span>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" value="boy" name = "sex">
<span>男</span><input type="radio" value="girl" name = "sex"><span>女</span> <br><br>

<input type = "submit" value = "注册" onclick="checkSame()"/>
</form>
</center>

</body>
</html>