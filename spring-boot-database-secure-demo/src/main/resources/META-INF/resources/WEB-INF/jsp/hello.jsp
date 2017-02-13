<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
    <sec:authentication var="user" property="principal" />
    <h2>Welcome ${user.username}!</h2>

    <h2>go to <a href="/admin">admin page</a>! you need admin authority</h2>
    <h2>go to <a href="/posts">posts page</a>! you need user authority</h2>
    <form action="/logout" method="post">
        <input type="submit" value="Sign Out"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</body>
</html>