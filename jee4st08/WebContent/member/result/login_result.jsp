<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="../../css/member.css" />
</head>
<body>
<div class="box">
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if(id != null 
			&& id.equals("hong")
			&& pw != null
			&& pw.equals("1")){
		response.sendRedirect("../../global/main.jsp");
	}else{
		%>
		<h2>로그인 실패!!</h2>
		<a href="../service/login.jsp">다시 시도하기</a>
		<%
	}
%>
</div>	
</body>
</html>