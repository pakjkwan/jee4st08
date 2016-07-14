<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<% 
	int i = 0, j = 0;
	for(i=1;i<10;i++){
		for(j=2;j<6;j++){%>
		<%=j%>*<%=i%>=<%=j*i%>&nbsp;&nbsp;<% 	
		}%>
	<br />	
	<%}
	%>
	<br />
	<% 
	for(i=1;i<10;i++){
		for(j=6;j<10;j++){%>
		<%=j%>*<%=i%>=<%=j*i%>&nbsp;&nbsp;<% 	
		}%>
	<br />	
	<%}
	%>
	<br />
</body>
</html>