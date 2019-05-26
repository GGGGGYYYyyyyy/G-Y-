<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息查询</title>
</head>
<body>
<%
String URL = "jdbc:mysql://localhost:3306/classmgr?serverTimezone=UTC ";
String USERNAME = "root";
String PWD = "root";
String SID = request.getParameter("ID");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	out.print(e);
}
try{
	Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
	PreparedStatement pStmt = conn.prepareStatement("select * from stuinfo where ID = ?" );
	pStmt.setString(1, SID);
	ResultSet rs = pStmt.executeQuery();
	if(rs.next()){
		%>
		<p align = "center"> 姓名:<%= rs.getString("Name") %></p>
		<p align = "center"> 学号:<%= rs.getString("ID") %></p>
		<p align = "center"> 密码:<%= rs.getString("Password") %></p>
		<p align = "center"> 籍贯:<%= rs.getString("NativePlace") %></p>
		<p align = "center"> 住址:<%= rs.getString("Address") %></p>
		<p align = "center"> 电子邮件:<%= rs.getString("EmailAddress") %></p>
		<p align = "center">查询成功！</p>
		<% 
		
	}
	rs.close();
	pStmt.close();
	conn.close();
	}catch(SQLException e){
		out.print(e);
	}
%>
<center>
<input type = "button" value = "返回功能选择页面" onclick = "javascript:window.location.href = 'FS.jsp';">
</center>
</body>
</html>