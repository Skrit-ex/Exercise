<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 14.02.2024
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="/user/reg" method="post">
    <input type="text" name="name" placeholder="Name">
    <p>${name}</p>
    <input type="text" name="username" placeholder="Username">
    <p>${username}</p>
    <input type="text" name="password" placeholder="password">
    <p>${password}</p>
    <button>Submit</button>
</form>

</body>
</html>
