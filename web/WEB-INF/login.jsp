<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Remember Me Login Page</h1>
        <form action="login" method="post">
            <p>Username: <input type="text" name="uName" value="${user.username}" /></p>
            <p>Password: <input type="text" name="pass" value="${user.password}" /></p>
            <p><input type="submit" value="Login"></p>
            <p><input type="checkbox" name="remember"> Remember me</p>
    </form>
    ${message}
    </body>
</html>
