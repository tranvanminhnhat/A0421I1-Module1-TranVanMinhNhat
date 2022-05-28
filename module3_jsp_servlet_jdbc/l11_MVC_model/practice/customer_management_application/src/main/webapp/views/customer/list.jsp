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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<a href="/customer?action=create">create a customer</a>
<C:if test="${message != null}">
    <strong style="color: red">${message}</strong>
</C:if>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Delete</th>
        <th scope="col">Update</th>
    </tr>
    </thead>
    <tbody>
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
    </tbody>
</table>

</body>
</html>
