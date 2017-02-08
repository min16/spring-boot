<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Admin Page</title>
    </head>
    <body>
        <c:if test="${param.error != null}">
            <p>Access is denied.</p>
        </c:if>
        <h2>Hello admin ${httpServletRequest.remoteUser}!</h2>
    </body>
</html>