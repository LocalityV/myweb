<%@ page import ="java.util.*" contentType="text/html; charset=gb2312"
pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>��½�ɹ�</title>
</head>
<body>
��ӭ�㣡��½�ɹ���<br>
<%
Date today = new Date();
int d = today.getDay();
int h = today.getHours();
String s = "";
if(h>0 && h < 12)
s = "�����";
else if(h>=12)
s = "�����";
String day[] = {"��","һ","��","��","��","��","��"};
out.println(s+ "������������" + day[d]);
%>

</body>
</html>