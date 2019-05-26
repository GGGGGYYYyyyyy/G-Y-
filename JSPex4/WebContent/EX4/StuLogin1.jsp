<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<center><b>学生信息登陆系统</b></center><br><br> 
<form action = "StuLogin.jsp" method = "get">
<center>
学生姓名:
<input name = "Name" type = "text" /><br/><br/>
学生学号:
<input neme = "ID" type = "text" /><br/><br/>
学生密码:
<input name = "Password" type = "password"/><br/><br/>
<center>
<input type = "submit" name = "Submit" value = "登陆"/>
<input type = "button" value = "返回" onclick = "javascript:window.location.href = 'HomePage.html';">
</center>
</center>
</body>
</html>