<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <sec:authorize access="isAuthenticated()">
            <sec:authentication var="user" property="principal" />
            <h2>Hello  ${user.username}!</h2>
        </sec:authorize>

        <sec:authorize access="isAnonymous()">
            <h2>Hello Someone!</h2>
        </sec:authorize>
        <p>Click <a href="/hello">here</a> to see a greeting.</p>
    </body>
</html>