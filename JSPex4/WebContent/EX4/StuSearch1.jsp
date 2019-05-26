<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><b>学生信息查询</b></center><br/>
<form name = "form2", action = "StuSearch.jsp",method = "get">
<center>
查询学生ID:
<input name = "ID" type = "text" /><br/><br/>
<input type = "submit" name = "Submit" value = "提交"/>
<input type = "button" value = "返回" onclick = "javascript:window.location.href = 'FS.jsp';">
</center>
</form>
</body>
</html>