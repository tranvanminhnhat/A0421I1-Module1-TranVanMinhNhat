<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 03/12/2021
  Time: 8:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="post">
  Number 1:
  <input type="text" name="number_1"><br>
  Number 2:
  <input type="text" name="number_2"><br>
  <select name="calculation">
    <option value="+">Addition</option>
    <option value="-">Subtraction</option>
    <option value="*">multiplication</option>
    <option value="/">Division</option>
  </select>
  <input type="text" value="${result}" readonly>
  <input type="submit" value="calculate">
</form>
</body>
</html>
