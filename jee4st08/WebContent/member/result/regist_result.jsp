<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
	<link rel="stylesheet" href="../../css/member.css" />

<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left;text-align: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	

</style>
</head>
<body>
	<div class="box">
		<span class="meta">이름</span>	<%=request.getParameter("name") %><br />
		<span class="meta">ID</span> <%=request.getParameter("id") %><br />
		<span class="meta">비밀번호</span> <%=request.getParameter("pw") %><br />
		<span class="meta">SSN</span><%=request.getParameter("ssn") %><br />
		<span class="meta">전공</span><%=request.getParameter("major") %><br />
		<span class="meta">수강과목</span>
		<%
		String[] subjects = request.getParameterValues("subject");
		if(subjects != null){
			for(int i=0;i<subjects.length;i++){
				%><%=subjects[i]%><br/><%
			}
		}
		%>
		
		회원가입을 축하드립니다. <%=request.getParameter("name") %> 님..
		
	<a href="../../index.jsp">
		<img src="../../img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.jsp">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
	
	</div>
</body>
</html>