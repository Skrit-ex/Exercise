<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 20.02.2024
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1> Registration </h1>
<s:form action="/user/reg" method="post">
    <input path="name" placeholder="Name"/>
    <br>
    <input path="username" placehorlder="Username" />
    <br>
    <input path="password" placehorlder="Password" />
    <button> Submit </button>
</s:form>
</body>
</html>
