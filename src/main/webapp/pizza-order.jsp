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

</head>
<body>


<div id="pizza-form">
    <form action="pizza-order" method="post">
        <h1>Order Your Pizza</h1>

        <label for="crust">Choose Crust</label>
        <select name="crust" id="crust">
            <option value="thin-crust">Thin</option>
            <option value="hand-tossed-crust">Hand-Tossed</option>
        </select>
        <br>
        <label for="sauce">Select Sauce Type</label>
        <select name="sauce" id="sauce">
            <option value="marinara">Marinara</option>
            <option value="alfredo">Alfredo</option>
        </select>
        <br>
        <label for="size">Select Pizza Size</label>
        <select name="size" id="size">
            <option value="12">12-inch</option>
            <option value="14">14-inch</option>
            <option value="18">18-inch</option>
        </select>
        <br>
        <h2>Toppings</h2>
        <label for="pepperoni">Pepperoni</label>
        <input id="pepperoni" name="pepperoni" type="checkbox" value="pepperoni">
        <label for="ham">Ham</label>
        <input id="ham" name="ham" type="checkbox" value="ham">
        <label for="sausage">Sausage</label>
        <input id="sausage" name="sausage" type="checkbox" value="sausage">
        <label for="pineapple">Pineapple</label>
        <input id="pineapple" name="pineapple" type="checkbox" value="pineapple">
        <label for="jalapenos">Jalapenos</label>
        <input id="jalapenos" type="checkbox" value="jalapenos">
        <br>
        <br>
        <label for="delivery-address">Delivery Address</label>
        <input id="delivery-address" type="text">
        <input name = "submit" id="submit" type="submit">
    </form>
</div>
</body>
</html>
