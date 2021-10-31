<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 25/10/2021
  Time: 11:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Title</title>
    <link rel="stylesheet" href="../static/css/home.css">
</head>
<body>
<div class="container">
    <table class="table border-top border-dark">
        <tr>
            <th colspan="5"><h2>Danh sách khách hàng</h2></th>
        </tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Avatar</th>
        </tr>
        <c:forEach items="${list}" var="customer">
            <tr>
                <td style="padding-top: 40px"><p>${customer.id}</p></td>
                <td style="padding-top: 40px"><p>${customer.birthday}</p></td>
                <td style="padding-top: 40px"><p>${customer.name}</p></td>
                <td style="padding-top: 40px"><p>${customer.address}</p></td>
                <td><img src="${customer.avatar}"></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
