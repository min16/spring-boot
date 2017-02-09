<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Posts Page</title>
</head>
<body>
<%--<h2>Hello <%= request.getUserPrincipal().getName()%>!</h2>--%>
<h3>${result}</h3>
<h2>Hello ${name}!</h2>
<h3>This is posts page</h3>
<h3><a href="/posts/write">write</a></h3>
<h3><a href="/">go back home</a></h3>
</body>
</html>