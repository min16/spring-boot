<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Posts Page</title>
</head>
<body>
<h3>${result}</h3>
<sec:authentication var="user" property="principal" />
<h3>This is posts page, ${user.username}</h3>
<h3><a href="/posts/write">write</a> you need admin authority</h3>
<h3><a href="/">go back home</a></h3>
</body>
</html>