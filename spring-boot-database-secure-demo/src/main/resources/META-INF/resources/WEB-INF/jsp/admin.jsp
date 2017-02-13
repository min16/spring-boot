<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
    <head>
        <title>Admin Page</title>
    </head>
    <body>
        <sec:authentication var="user" property="principal" />
        <h2>Hello admin ${user.username}!</h2>
        <h3><a href="/">go back home</a></h3>
    </body>
</html>