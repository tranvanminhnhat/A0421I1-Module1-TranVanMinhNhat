<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/10/2021
  Time: 8:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update customer</title>
</head>
<body>
    <h4>${message}</h4>
    <form method="post">
        <input type="text" name="name" id="name" value="${customer.getName()}">
        <input type="text" name="email" id="email" value="${customer.getEmail()}">
        <input type="text" name="address" id="address" value="${customer.getAddress()}">
        <input type="submit" value="Update">
        <button><a href="/customer">Back to list</a></button>
    </form>
</body>
</html>
