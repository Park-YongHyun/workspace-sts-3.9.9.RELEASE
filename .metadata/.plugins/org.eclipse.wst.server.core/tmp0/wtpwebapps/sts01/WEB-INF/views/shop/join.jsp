<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/mem/join.do" 
		method="post">
		아이디 : <input type="text" name="mem_id" value="id"><br />
		암호 : <input type="password" name="mem_pw" value="pw"><br />
		암호확인 :<input type="password" name="mem_pw1"><br /> 
		이름 : <input type="text" name="mem_name" value="na"/><br />
		폰 : <input type="text" name="mem_phone" value="010"/><br />
		주소 : <input type="text" name="mem_addr" value="ad"/><br />
		
		등급: <select name="mem_grade">
			<option value="1">고객</option>
			<option value="9">상점</option>
		</select><br />
		
		<input type="submit" value="회원가입" />
	</form>
</body>
</html>