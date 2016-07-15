<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberBean" %>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/member.css" />
</head>
<body>
<div class="box">

<h1>정보수정 페이지 </h1>


	<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	
	
	String id = request.getParameter("id");
	String newPw = request.getParameter("newPw");
		if(id.equals("")||newPw.equals("")){
			%>
			<h2>회원가입 실패!!</h2>
			<a href="../service/update.jsp">다시 시도하기</a>
		
			<%
		}else {
			member.setId(id);
			member.setPw(newPw);
			
			String spec = service.update(member);
			application.log("DB다녀온 이름:"+spec);
			if(spec.equals("")){
				%>
				<h2>로그인 실패!!</h2>
				<a href="../service/update.jsp">다시 시도하기</a>
				<%
			}else {
%>
				
				
				<br/><br /><br />
			<p>	변경되었습니다 <%= request.getParameter("id") %> 님</p><br/>
<% 
			}
		}
		%>



<a href="<%=ctx %>/memberController.jsp">
<img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/img/home.png" alt="member" style="width:30px" />
		</a>


</div>
</body>
</html>