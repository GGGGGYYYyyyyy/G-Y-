<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String URL = "jdbc:mysql://localhost:3306/classmgr?serverTimezone=UTC ";
String USERNAME = "root";
String PWD = "root";
String Name = request.getParameter("Name");
String ID = request.getParameter("StuId");
String Password = request.getParameter("Password");
String Birthday = request.getParameter("Birthday");
String NativePlace = request.getParameter("NativePlace");
String Address = request.getParameter("Address");
String EmailAddress = request.getParameter("EmailAddress");

try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	out.print(e);
}
try{
	Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
	PreparedStatement pStmt = conn.prepareStatement("select * from stuinfo where ID = ?");
	pStmt.setString(1, ID);
	ResultSet rs = pStmt.executeQuery();
	if(rs.next()){
		out.println("用户已存在");
	}
	else{
		PreparedStatement pStmt2 = conn.prepareStatement("insert into stuinfo (Name,ID,Password,Birthday,NativePlace,Address,EmailAddress)values(?,?,?,?,?,?,?)");
		pStmt2.setString(1, Name);
		pStmt2.setString(2, ID);
		pStmt2.setString(3, Password);
		pStmt2.setString(4, Birthday);
		pStmt2.setString(5, NativePlace);
		pStmt2.setString(6, Address);
		pStmt2.setString(7, EmailAddress);
		int rtn = pStmt2.executeUpdate();
		out.print("注册成功！！！");
	}
	pStmt.close();
	conn.close(); 
}catch (SQLException e) {
	out.print(e);
}
%>
<br/>
<input type = "button" value = "返回登陆" onclick = "javascript:window.location.href = 'StuLogin1.jsp';">
</body>
</html>