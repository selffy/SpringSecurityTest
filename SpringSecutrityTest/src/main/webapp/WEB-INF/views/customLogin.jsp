<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Custom Login Page</h1>
<h2>${error}</h2>
<h2>${logout}</h2>

<form method="post" action="/login">
	<input type="text" name="username" value="admin"/>
	<input type="password" name="password" value="admin"/>
	<input type="checkbox" name="remember-me"/>자동로그인
	<input type="submit"/>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>