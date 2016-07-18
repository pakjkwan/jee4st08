<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberBean" %>
    <%String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />
</head>
<body>
<div class="box">
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	application.log("넘어온ID"+id);
	application.log("넘어온PW"+pw);
	member.setId(id);
	member.setPw(pw);
	service.logout(member);
	response.sendRedirect(ctx+"/index.jsp");
%>
</div>	
</body>
</html>