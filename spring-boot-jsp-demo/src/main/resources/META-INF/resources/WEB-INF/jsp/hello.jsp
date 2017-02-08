<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h1>Hello ${httpServletRequest.remoteUser}!</h1>
<form action="/logout" method="post">
    <input type="submit" value="Sign Out"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>