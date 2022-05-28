<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 30/10/2021
  Time: 9:04 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting page</title>
</head>
<body>
<form method="post">
    <h3>Name: ${requestScope["product"].getName()}</h3>
    <h3>Brand: ${requestScope["product"].getBrand()}</h3>
    <h3>Price: ${requestScope["product"].getPrice()}</h3>
    <input type="submit" value="Delete">
    <button><a href="/product">Back to list</a></button>
</form>
</body>
</html>
