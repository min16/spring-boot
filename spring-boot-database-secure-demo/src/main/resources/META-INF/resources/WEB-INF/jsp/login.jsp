<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>

    <c:if test="${param.error != null}">
        <p>Invalid username and password.</p>
    </c:if>
    <c:if test="${param.logout != null}">
        <p>You have been logged out.</p>
    </c:if>
    <form action="/login" method="post">
        <label for="name">Username</label>
        <input type=" text" name="username" id="name"/>
        <label for="password">password</label>
        <input type="password" name="password" id="password"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Sign In">
    </form>
    </body>
</html>