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
    <s:input path="name" placeholder="Name"/>
    <br>
    <s:input path="username" placehorlder="Username" />
    <br>
    <s:input path="password" placehorlder="Password" />
    <s:button> Submit </s:button>
</s:form>
</body>
</html>
