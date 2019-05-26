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
String AName = request.getParameter("Name");
String APassword = request.getParameter("Password");
String AID = request.getParameter("ID");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	out.print(e);
}
try{
	Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
	PreparedStatement pStmt = conn.prepareStatement("select * from stuinfo where ID = ? and Password = ?");
	pStmt.setString(1, AID);
	pStmt.setString(2, APassword);
	//pStmt.setString(3, AName);
	ResultSet rs = pStmt.executeQuery();
	if(AID.equals("123") && APassword.equals("987")){
		out.println("管理员登陆成功!!");	
		//request.getRequestDispatcher("AdModification1.jsp").forward(request,response);
		response.sendRedirect("AdModification1.jsp");
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
<input type = "button" value = "管理员权限" onclick = "javascript:window.location.href = 'AdModification1.jsp';">
</body>
</html>