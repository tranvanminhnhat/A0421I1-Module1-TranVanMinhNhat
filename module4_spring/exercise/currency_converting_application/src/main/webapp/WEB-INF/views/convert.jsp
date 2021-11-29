<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 29/11/2021
  Time: 9:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Currency</title>
</head>
<body>
<form method="post" action="/convert">
    <label>Xin mời bạn nhập tiền tệ Việt Nam</label>
    <input name="vnd" placeholder="Nhập số tiền bạn muốn đổi">
    <button type="submit">Convert</button>
</form>
</body>
</html>
