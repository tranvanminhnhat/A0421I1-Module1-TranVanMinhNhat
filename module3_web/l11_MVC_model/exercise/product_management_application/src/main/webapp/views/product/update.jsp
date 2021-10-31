<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 30/10/2021
  Time: 9:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>${message}</h4>
<form method="post">
    <input type="text" name="name" id="name" value="${product.getName()}">
    <input type="text" name="brand" id="brand" value="${product.getBrand()}">
    <input type="text" name="price" id="price" value="${product.getPrice()}">
    <input type="submit" value="Update">
    <button><a href="/product">Back to list</a></button>
</form>
</body>
</html>
