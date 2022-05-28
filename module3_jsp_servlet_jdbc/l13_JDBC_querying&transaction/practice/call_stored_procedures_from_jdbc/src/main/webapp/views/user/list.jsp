<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 08/11/2021
  Time: 8:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List user</title>
</head>
<body>
<form action="/user?action=findUserById" method="post">
    <h2>Get User By Id</h2>
    <input type="text" name="id" id="id">
    <input type="submit" value="Find User">
</form>
<h3><a href="/user?action=create">Create User</a></h3>
<h3 style="color: red">${message}</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
