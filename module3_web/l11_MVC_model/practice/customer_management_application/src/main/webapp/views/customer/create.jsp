<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/10/2021
  Time: 8:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create customer</title>
</head>
<body>
<form method="post">
    Name: <input type="text" id="name" name="name">
    Email: <input type="text" id="email" name="email">
    Address: <input type="text" id="address" name="address">
    <a href="/customer">Back to list</a>
    <input type="submit" value="Create Customer">
</form>
</body>
</html>
