<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/11/2021
  Time: 11:53 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate from Vietnamese to English</title>
</head>
<body>
<form action="/translate" method="post">
    <h2>Enter a vietnamese word</h2>
    <input name="englishWord" placeholder="Enter a english word!">
    <button type="submit">Translate</button>
</form>
</body>
</html>
