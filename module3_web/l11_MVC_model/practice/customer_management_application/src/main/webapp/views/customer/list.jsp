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
    <title>Customer list</title>
</head>
<body>
<a href="/customer?action=create">create a customer</a>
<C:if test="${message != null}">
    <strong style="color: red">${message}</strong>
</C:if>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Delete</th>
        <th>Update</th>
    </tr>
    <C:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td>
                <a href="/customer?action=delete&id=${customer.getId()}">Delete</a>
            </td>
            <td>
                <a href="/customer?action=update&id=${customer.getId()}">Update</a>
            </td>
        </tr>
    </C:forEach>
</table>
</body>
</html>
