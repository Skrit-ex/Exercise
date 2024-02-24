<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 25.02.2024
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<jsp:include page="home.jsp"></jsp:include>

<form action="/user/login" method="post">

    <div class="input-group flex-nowrap">
        <span class="input-group-text" id="addon-wrapping"></span>
        <input type="text" class="form-control" placeholder="username" name="username" aria-label="Username" aria-describedby="addon-wrapping">
    </div>

    <div class="input-group flex-nowrap">
        <span class="input-group-text" id="addon-wrapping2"></span>
        <input type="text" class="form-control" placeholder="password" name="password" aria-label="Password" aria-describedby="addon-wrapping">
    </div>

    <button>Submit</button>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
