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
<center><b>学生注册系统</b></center><br><br> 
<form action = "StuRegister.jsp"  method="post">
姓名:
<input name = "Name" type = "text" /><br/><br/>
学号:
<input name ="StuId"  type = "text" /><br/><br/>
密码:
<input name = "Password" type = "password"/><br/><br/>
生日:
<input name = "Birthday" type = "text"/><br/><br/>
出生地:
<input name = "NativePlace" type = "text"/><br/><br/>
地址:
<input name = "Address" type = "text"/><br/><br/>
电子邮箱:
<input name = "EmailAddress" type = "text"/><br/><br/>
</center>
<center>
<input type = "submit" name = "Submit" value = "注册"/>
<input type = "button" value = "返回" onclick = "javascript:window.location.href = 'HomePage.html';">
</center>
</form>
</body>
</html>