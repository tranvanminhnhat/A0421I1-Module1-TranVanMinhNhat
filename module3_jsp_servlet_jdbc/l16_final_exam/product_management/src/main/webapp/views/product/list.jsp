<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 22/11/2021
  Time: 6:04 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <table class="table table-striped table-bordered table-hover table-responsive-md">
        <thead>
        <tr>
            <th colspan="8"><h3 style="font-family: sans-serif; text-align: center;">Product List</h3></th>
        </tr>
        <tr style="background-color: #046056; color: #fff">
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
            <th class="text-center">
                <a href="/product?action=create" style="color: #fff;"><i class="far fa-plus-square"></i></a>
            </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.product_name}</td>
                <td>${product.product_price}</td>
                <td>${product.product_quantity}</td>
                <td>${product.product_color}</td>
                <td>${product.category.category_name}</td>
                <td class="text-center">
                    <a href="/product?action=update&id=${product.product_id}" style="color: #fff;"><i
                            class="fas fa-edit text-primary"></i></a>
                    <a href="/product?action=delete&id=${product.product_id}"><i
                            class="far fa-trash-alt text-danger"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
