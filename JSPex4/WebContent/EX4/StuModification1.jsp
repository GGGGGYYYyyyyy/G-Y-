<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<center><b>学生信息修改</b></center><br/><br/>
<form name = "form1" action = "StuModification.jsp" method = "post">
<center>
姓名:<input name = "Name" type = "text" /><br/>
学号:<input name = "ID" type = "text" /><br/>
密码：<input name = "Password" type = "password" /><br>
生日：<input name = "Birthday" type = "text"/><br>
出生地：<input name = "NativePlace" type = "text"/><br>
地址：<input name = "Address" type = "text"/><br>
电子邮件:<input name = "EmailAddress" type = "text"/><br>
<input type = "submit" name = "Submit" value = "提交"/>
<input type = "button" value = "返回" onclick = "javascript:window.location.href = 'FS.jsp';">
</center>
</form>
</body>
</html>