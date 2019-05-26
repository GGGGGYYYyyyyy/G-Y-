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
String Name = request.getParameter("Name");
String Password = request.getParameter("Password");
String ID = request.getParameter("ID");

try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	out.print(e);
}
try{
	Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
	PreparedStatement pStmt = conn.prepareStatement("select * from stuinfo where Name = ? and Password = ?");
	pStmt.setString(1, Name);
	pStmt.setString(2, Password);
	ResultSet rs = pStmt.executeQuery();
	if(rs.next()){
		out.println("登陆成功");
		//response.sendRedirect("FC.jsp");
	}
	else{
		out.println("登陆失败");
	}
	rs.close();
	pStmt.close();
	conn.close(); 
}catch (SQLException e) {
	out.print(e);
}
%>
<br/>
<input type = "button" value = "返回登陆" onclick = "javascript:window.location.href = 'StuLogin.jsp';">
<input type = "button" value = "功能选择" onclick = "javascript:window.location.href = 'FS.jsp';">
</body>
</html>