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
    <title>Delete customer</title>
</head>
<body>
    <form method="post">
        <h3>Name: ${requestScope["customer"].getName()}</h3>
        <h3>Email: ${requestScope["customer"].getEmail()}</h3>
        <h3>Address: ${requestScope["customer"].getAddress()}</h3>
        <input type="submit" value="Delete">
        <button><a href="/customer">Back to list</a></button>
    </form>
</body>
</html>
