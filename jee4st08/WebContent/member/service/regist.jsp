<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
	<link rel="stylesheet" href="../../css/member.css" />

<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	
</style>
</head>
<body>
	<div class="box">
	<form action="" method="get">
		이름 : <input type="text" name="name" /><br />
		ID : <input type="text" name="id"/><br />
		비밀번호 : <input type="text" name="pw" /><br />
		SSN : <input type="text" name="ssn" /><br />
		통신사 : 
		<input type="checkbox" name="SKT" value="skt" /> SKT
		<input type="checkbox" name="KT" value="kt" /> KT
		<input type="checkbox" name="LGU" value="lgu" /> LGU+ <br />
		성별 : 
		<input type="radio" name="gender" value="male"/> 남
		<input type="radio" name="gender" value="female"/> 여 <br />
		<input type="submit" value="회원가입" />
		<input type="reset" value="취소" />
	</form>
	<a href="../../index.jsp">
		<img src="../../img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.jsp">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
	</div>
</body>
</html>