<%@ page language="java" contentType="text/html; charset=gb2312"
   pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="register.jpg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ע�����</title>
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
x.innerHTML="<br><br>�����������벻һ��";
return false;
}
x.innerHTML="";
return true;

}
</script>

<center> <span>ע������MMS�˻�</span> </center><br>
<center>
<form action="signin" method="post">
<span>�û���</span>&nbsp;&nbsp;
<input type="text" name = "username" /><br><br>
<span>����</span>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="password" name = "password" id="keyFirst"> <br><br>
<span>����ȷ��</span>
<input type="password" name = "passwordEnsure" id="keySecond"> 
<span id="wrongMessage"></span><br><br>
<span>�ǳ�</span>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name = "nikname"> <br><br>
<span>�Ա�</span>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" value="boy" name = "sex">
<span>��</span><input type="radio" value="girl" name = "sex"><span>Ů</span> <br><br>

<input type = "submit" value = "ע��" onclick="checkSame()"/>
</form>
</center>

</body>
</html>