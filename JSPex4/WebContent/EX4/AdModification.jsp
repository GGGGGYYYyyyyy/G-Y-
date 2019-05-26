<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String URL = "jdbc:mysql://localhost:3306/classmgr?serverTimezone=UTC ";
String USERNAME = "root";
String PWD = "root";
String ID = request.getParameter("ID");
String Pwd = request.getParameter("Password");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	out.print(e);
}
try{
	Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
	PreparedStatement pStmt = conn.prepareStatement("update stuinfo set Password = ? where ID = ?");
	pStmt.setString(1, ID);
	pStmt.setString(2, Pwd);
	int rtn = pStmt.executeUpdate();
	out.println("学生密码修改成功");
	pStmt.close();
	conn.close(); 
}catch (SQLException e) {
	out.print(e);
}
%>

</body>
</html>