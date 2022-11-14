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
<h1>관리자 접근 허용 admin.jsp</h1>
<h1>/Sample/admin page</h1>
<p>principal : <sec:authentication property="principal"/></p>
<p>MemberVO: <sec:authentication property="principal.member"/></p>
<p>사용자아이디 : <sec:authentication property="principal.member.username"/></p>
<p>사용자 권한 리스트 : <sec:authentication property="principal.username"/></p>


<a href="/customLogout">Logout</a>

</body>
</html>