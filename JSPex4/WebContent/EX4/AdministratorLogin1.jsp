<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<center>
<center><b>管理员登陆系统</b></center><br><br> 
<form action = "AdministratorLogin.jsp" method = "get">
管理员姓名:
<input name = "Name" type = "text" /><br/><br/>
管理员学号:
<input name = "ID" type = "text" /><br/><br/>
管理员密码:
<input name = "Password" type = "password"/><br/><br/>
<center>
<input type = "submit" name = "Submit" value = "登陆"/>
<input type = "button" value = "返回" onclick = "javascript:window.location.href = 'HomePage.html';">
</center>
</body>
</html>