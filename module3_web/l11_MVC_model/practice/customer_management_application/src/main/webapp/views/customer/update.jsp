<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/10/2021
  Time: 8:42 CH
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
      integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update customer</title>
</head>
<body>
<h4>${message}</h4>
<div class="row">
    <form method="post" class="col-lg-3">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp"
                   value="${customer.getName()}">
        </div>
        <div class="form-group">
            <label for="name">Email</label>
            <input type="text" class="form-control" id="email" name="email" aria-describedby="emailHelp"
                   value="${customer.getEmail()}">
        </div>
        <div class="form-group">
            <label for="name">Address</label>
            <input type="text" class="form-control" id="address" name="address" aria-describedby="emailHelp"
                   value="${customer.getAddress()}">
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
        <button><a href="/customer">Back to list</a></button>
    </form>
</div>

</body>
</html>
