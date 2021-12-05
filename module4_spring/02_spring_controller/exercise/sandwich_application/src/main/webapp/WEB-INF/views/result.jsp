<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 03/12/2021
  Time: 8:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List choice</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<c:forEach items="${listChoice}" var="choice">
    <h3>${choice}</h3>
</c:forEach>
</body>
</html>
