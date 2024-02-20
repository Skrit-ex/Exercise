<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 20.02.2024
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1> Home page </h1>
<br>
<s:form action="/user/reg" method="post">
<button>Registration</button>
</s:form>
<br>
<s:form action="/user/login" method="post">
    <button>Login</button>
</s:form>

</body>
</html>
