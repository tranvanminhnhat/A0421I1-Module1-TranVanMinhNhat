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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<form method="post">
    <div class="form-group">
        <label for="name">Name</label>
        <input type="text" class="form-control" id="name"  name="name" aria-describedby="emailHelp">
    </div>
    <div class="form-group">
        <label for="name">Email</label>
        <input type="text" class="form-control" id="email"  name="email" aria-describedby="emailHelp">
    </div>
    <div class="form-group">
        <label for="name">Address</label>
        <input type="text" class="form-control" id="address"  name="address" aria-describedby="emailHelp">
    </div>
    <button> <a href="/customer">Back to list</a></button>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
