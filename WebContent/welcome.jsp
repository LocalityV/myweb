<%@ page import ="java.util.*" contentType="text/html; charset=gb2312"
pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>登陆成功</title>
</head>
<body>
欢迎你！登陆成功！<br>
<%
Date today = new Date();
int d = today.getDay();
int h = today.getHours();
String s = "";
if(h>0 && h < 12)
s = "上午好";
else if(h>=12)
s = "下午好";
String day[] = {"日","一","二","三","四","五","六"};
out.println(s+ "，今天是星期" + day[d]);
%>

</body>
</html>