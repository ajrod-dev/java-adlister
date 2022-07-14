<%--
  Created by IntelliJ IDEA.
  User: alexrodriguez
  Date: 7/14/22
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% if (request.getParameter("username") != null && request.getParameter("password") != null) {
    if (request.getParameter("username").equalsIgnoreCase("admin") && request.getParameter("password").equalsIgnoreCase("password")){
    response.sendRedirect("profile.jsp");
    }else{
        response.sendRedirect("login.jsp");
    }
}%>

<html>
<head>
    <%@include file="partials/head.jsp"%>
    <title>Title</title>
</head>
<body>
<div class="nav">
    <%@include file="partials/navbar.jsp"%>
</div>
<h1>Sign In</h1>
<form id="login" action="${pageContext.request.contextPath}/login.jsp">
    <label for="username">Username:</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password">
    <input type="submit" value="submit">
</form>
</body>
</html>
