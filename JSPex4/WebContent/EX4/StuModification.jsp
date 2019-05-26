<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>信息修改</title>
</head>
<body>
<%
String URL = "jdbc:mysql://localhost:3306/classmgr?serverTimezone=UTC ";
String USERNAME = "root";
String PWD = "root";
String GID = request.getParameter("ID");
String GPassword = request.getParameter("Password");
String GBirthday = request.getParameter("Birthday");
String GNativePlace = request.getParameter("NativePlace");
String GAddress = request.getParameter("Address");
String GEmailAddress = request.getParameter("EmailAddress");

try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	out.print(e);
}
try{
	Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
	String sql = "update stuinfo set Password = ?,Birthday = ?,NativePlace = ?,Address= ?,EmailAddress = ? where ID = ?";
	PreparedStatement pStmt = conn.prepareStatement(sql);
	pStmt.setString(1, GPassword);
	pStmt.setString(2, GBirthday);
	pStmt.setString(3, GNativePlace);
	pStmt.setString(4, GAddress);
	pStmt.setString(5, GEmailAddress);
	pStmt.setString(6, GID);
	int rtn = pStmt.executeUpdate();
	out.println("学生信息修改成功");
	conn.close();
	pStmt.close();
}catch(SQLException e){
	out.print(e);
}
%>
<br><br>
<input type = "button" value = "返回功能选择页面" onclick = "javascript:window.location.href = 'FS.jsp';">
</body>
</html>