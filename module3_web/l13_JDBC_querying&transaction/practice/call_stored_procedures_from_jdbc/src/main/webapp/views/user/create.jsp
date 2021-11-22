<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 09/11/2021
  Time: 4:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/user?action=create">
        Name: <input type="text" name="name" id="name" placeholder="Enter your name">
        Email <input type="text" name="email" id="email" placeholder="Enter your email">
        Country <input type="text" name="country" id="country" placeholder="Enter your country">
        <input type="submit" value="Create">
    </form>
</body>
</html>
