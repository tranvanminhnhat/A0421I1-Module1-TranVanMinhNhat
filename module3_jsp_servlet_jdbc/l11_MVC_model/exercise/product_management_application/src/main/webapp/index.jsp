<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 30/10/2021
  Time: 8:59 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Home</h1>
  <form method="post" action="/product?action=search">
    <input type="text" id="search" name="search" placeholder="Find product by name">
    <input type="submit" value="Search">
  </form>
  <h3><a href="/product">List Product</a></h3>
  </body>
</html>
