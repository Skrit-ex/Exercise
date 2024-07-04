<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
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

<%-- SECOND METHOD--%>

<s:form action="/user/reg" method="post" modelAttribute="newUser" >
    <s:input path="name" placeholder="name"/>
    <br>
    <s:errors path="name"/>
    <br>
    <s:input path="username" placeholder="username"/>
    <br>
    <s:errors path="username"/>
    <br><s:input path="password" placeholder="password"/>
    <br>
    <s:errors path="password"/>
    <br>
    <s:button> Submit </s:button>
</s:form>

<%--   FIRST METHOD

<%--<form action="/user/reg" method="post">--%>
<%--    <input type="text" name="name" placeholder="Name">--%>
<%--    <p>${name}</p>--%>
<%--    <input type="text" name="username" placeholder="Username">--%>
<%--    <p>${username}</p>--%>
<%--    <input type="text" name="password" placeholder="password">--%>
<%--    <p>${password}</p>--%>
<%--    <button>Submit</button>--%>
<%--</form>--%>

</body>
</html>
