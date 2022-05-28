<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 09/11/2021
  Time: 3:36 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Hello ${user.getName()}</h2>
    <h4>Email: ${user.getEmail()}</h4>
    <h4>Country: ${user.getCountry()}</h4>
<a href="/user">Back to list</a>
</body>
</html>
