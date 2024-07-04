<%@ page import="by.tms.User" %>
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>




<%
    User user = (User) session.getAttribute("user");

    if(user == null){
        out.print("<h1> Hello guest </h1>");
    }
    if(user != null){
        out.print("<h1> Hello" + user.getFirstname() + "! </h1>");
    }
    %>



 <s:form action = "/user/reg" method = "post" >
         <input type="text" placeholder="Firstname" name="firstname">
     <br>
     <p>${firstname}</p>
         <input type="text" placeholder="Username" name="username">
     <br>
     <p>${username}</p>
     <input type="text" placeholder="Email" name="email">
     <br>
     <p>${email}</p>
         <input type="password" placeholder="Password" name="password" >
     <br>
     <p>${password}</p>
         <button> Submit </button>
</s:form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
