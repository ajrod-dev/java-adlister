<%--
  Created by IntelliJ IDEA.
  User: alexrodriguez
  Date: 7/15/22
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <title>Order Pizza</title>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<div>
    <form action="/pizza-order.jsp" method="post">
        <h1>Order Your Pizza</h1>
        <h2>Select Crust Type</h2>
        <label for="thin-crust"></label>
        <input id="thin-crust" name="thin-crust" type="radio" value="thin">
        <label for="hand-tossed-crust"></label>
        <input id="hand-tossed-crust" name="hand-tossed-crust" type="radio" value="hand-tossed">
        <br>
        <h2>Select Sauce Type</h2>
        <label for="marinara"></label>
        <input id="marinara" name="marinara" type="radio" value="marinara">
        <label for="alfredo"></label>
        <input id="alfredo" name="alfredo" type="radio" value="alfredo">
        <br>
        <h2>Select Pizza Size</h2>
        <label for="18-inch"></label>
        <input id="18-inch" name="18-inch" type="radio" value="18">
        <label for="12-inch"></label>
        <input id="12-inch" name="12-inch" type="radio" value="12">
        <br>
        <h2>Toppings</h2>
        <label for="pepperoni"></label>
        <input id="pepperoni" name="pepperoni" type="checkbox" value="pepperoni">
        <label for="ham"></label>
        <input id="ham" name="ham" type="checkbox" value="ham">
        <label for="sausage"></label>
        <input id="sausage" name="sausage" type="checkbox" value="sausage">
        <label for="pineapple"></label>
        <input id="pineapple" name="pineapple" type="checkbox" value="pineapple">
        <label for="jalapenos"></label>
        <input id="jalapenos" name="jalapenos" type="checkbox" value="jalapenos">
        <br>
        <label for="delivery-address"></label>
        <input id="delivery-address" type="text">
    </form>
</div>
</body>
</html>
