<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 30/10/2021
  Time: 9:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product?action=create">create a product</a>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Delete</th>
        <th>Update</th>
        <th>Detail</th>
    </tr>
    <C:forEach items="${productList}" var="product">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getBrand()}</td>
            <td>${product.getPrice()}</td>
            <td>
                <a href="/product?action=delete&id=${product.getId()}">Delete</a>
            </td>
            <td>
                <a href="/product?action=update&id=${product.getId()}">Update</a>
            </td>
            <td>
                <a href="/product?action=detail&id=${product.getId()}">Detail</a>
            </td>
        </tr>
    </C:forEach>
</table>
</body>
</html>
