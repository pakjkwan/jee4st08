<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String ctx=application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<img src="<%=ctx%>/img/banner.jpg" alt="" />
	<%
	int i=0,sum=0;
	for(;i<10;i++){
		sum+=(i+1);	
	}%>
	<br/>
	<%=sum%>
	
	
</body>
</html>