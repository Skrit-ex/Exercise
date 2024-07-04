<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 15.02.2024
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<p1> Log In </p1>

<s:form action="/user/login" method="post" modelAttribute="newLogin" >
    <s:input path="name" placeholder="Name"/>
    <br>
    <s:errors path="name"/>
    <br>
    <s:input path="password" placeholder="Password"/>
    <br>
    <s:errors path="password"/>
    <s:button>Submit</s:button>
</s:form>

</body>
</html>