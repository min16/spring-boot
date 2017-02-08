<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
   <%-- <sec:authorize var="loggedIn" access="isAuthenticated()" />
    <c:choose>
        <c:when test="${loggedIn}">
            <h1>Hello World - <%= request.getUserPrincipal().getName()%>!</h1>
        </c:when>
        <c:otherwise>
            <h1>Hello World - someone!</h1>
        </c:otherwise>
    </c:choose>--%>
   <c:choose>
       <c:when test="${name}!=null">
           <h1>Hello World - ${name}!</h1>
       </c:when>
       <c:otherwise>
           <h1>Helol World - someone!</h1>
       </c:otherwise>
   </c:choose>

    <p>Click <a href="/hello">here</a> to see a greeting.</p>
    </body>
</html>