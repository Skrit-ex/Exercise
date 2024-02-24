<%@ page import="by.tms.User" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 20.02.2024
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1> Home page </h1>

<%
    User user = (User) session.getAttribute("user");

    if(user == null){
        out.print("<h1> Hello guest </h1>");
    }
    if(user != null){
        out.print("<h1> Hello" + user.getName() + "! </h1>");
    }
%>


<br
<c:set var="user" value="${sessionScope.user}" />
<c:choose>
    <c:when test="${not empty sessionScope.user}">
        <s:form action="/calculator" method="post">
            <button>Calculator</button>
        </s:form>
    </c:when>
</c:choose>
<s:form action="/user/reg" method="post">
<button>Registration</button>
</s:form>
<br>
<s:form action="/user/login" method="post">
    <button>Login</button>
</s:form>

</body>
</html>
