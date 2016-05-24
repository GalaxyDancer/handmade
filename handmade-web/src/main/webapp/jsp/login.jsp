<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    <h1>Login page</h1>
    <form>
        <input type="hidden" name="command" value="AUTORISATION">
        <input type="text" id="name" name="name" placeholder="Username" required="">
        <br/>
        <input type="password" id="password" name="password"  placeholder="Password" required="">
        <br/>
        <input type="submit" value="SIGN IN">
    </form>
    </body>
</html>
