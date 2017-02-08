<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Admin Page</title>
    </head>
    <body>
        <%--<h2>Hello <%= request.getUserPrincipal().getName()%>!</h2>--%>
        <h2>Hello ${name}!</h2>
        <h3><a href="/">go back home</a></h3>
    </body>
</html>