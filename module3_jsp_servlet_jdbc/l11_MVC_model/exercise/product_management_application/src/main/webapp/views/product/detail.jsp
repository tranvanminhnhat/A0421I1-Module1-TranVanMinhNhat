<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 01/11/2021
  Time: 8:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Detail</title>
</head>
<body>
    <h1>Product Detail</h1>
    <h3>Name: ${product.getName()}</h3>
    <h3>Brand: ${product.getBrand()}</h3>
    <h3>Price: ${product.getPrice()}</h3>
    <a href="/product">Back to list</a>
</body>
</html>
