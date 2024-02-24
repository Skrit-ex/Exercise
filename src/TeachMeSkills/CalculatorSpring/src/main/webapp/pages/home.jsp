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

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">HomePage</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/user/reg">Registration</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/user/login">Login</a>
                </li>
                <c:choose>
                    <c:when test="${not empty sessionScope.user}">
                        <li class="nav-item">
                            <a class="nav-link" href="/user/login">Login</a>
                        </li>
                    </c:when>
                </c:choose>

            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>


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
