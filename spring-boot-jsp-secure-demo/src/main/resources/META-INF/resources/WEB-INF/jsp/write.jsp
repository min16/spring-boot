<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Write Page</title>
</head>
<body>
<%--<h2>Hello <%= request.getUserPrincipal().getName()%>!</h2>--%>
<h2>Hello ${name}!</h2>
<h3>This is write page</h3>
<form action="/posts" method="post">
    <label for="content">Content</label>
    <input type=" text" name="content" id="content"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" value="Save">
</form>
<h3><a href="/">go back home</a></h3>
<h3><a href="/posts">go back posts</a></h3>
</body>
</html>