<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 22/11/2021
  Time: 7:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Product</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/product?action=update" method="post">
        <div>
            <h3 style="font-family: sans-serif; text-align: center;">Update Product</h3>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Name</label>
                <input type="text" class="form-control" name="product_name" value="${product.product_name}">
            </div>
            <div class="form-group col-md-6">
                <label>Price</label>
                <input type="text" class="form-control" name="product_price" value="${product.product_price}">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Quantity</label>
                <input type="text" class="form-control" name="product_quantity" value="${product.product_quantity}">
            </div>
            <div class="form-group col-md-6">
                <label>Color</label>
                <input type="text" class="form-control" name="product_color" value="${product.product_color}">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Description</label>
                <input type="text" class="form-control" name="product_description" value="${product.product_description}">
            </div>
            <div class="form-group col-md-6">
                <label>Category</label>
                <select class="form-control" name="category_id">
                    <c:forEach items="${categoryList}" var="category">
                        <option value="${category.category_id}"${category.category_id == product.category_id?"selected":""}>${category.category_name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <button type="submit" style="background-color: #046056; color: #fff;" class="btn">Update</button>
        <button style="background-color: #046056; color: #fff;" class="btn"><a href="/product">Back</a></button>
    </form>
</div>
</body>
</html>
