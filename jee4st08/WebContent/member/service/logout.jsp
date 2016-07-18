<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl" %>
<%@ page import="member.MemberService" %>
<%@ page import="member.MemberBean" %>
<% 
	String ctx = application.getContextPath(); 
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />
</head>
<body>
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean(); 
%>
<div class="box">
	<form action="<%=ctx%>/member/result/logout_result.jsp" method="post">
		<input type="hidden" name="id" value="<%=service.show().getId() %>" />
		<input type="hidden" name="pw" value="<%=service.show().getPw() %>" />
		<input type="submit" value="로그아웃"  />
	</form>
	
	</div>	
</body>
</html>