<html>
<head>
    <title>Hello World!</title>
</head>
<body>
    <%--<h1>Hello <%= request.getUserPrincipal().getName()%>!</h1>--%>
    <h1>Hello ${name}!</h1>
    <h2>go to <a href="/admin">admin page</a>!</h2>
    <form action="/logout" method="post">
        <input type="submit" value="Sign Out"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</body>
</html>