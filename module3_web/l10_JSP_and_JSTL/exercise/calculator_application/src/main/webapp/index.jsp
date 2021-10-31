<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/10/2021
  Time: 2:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="static/css/styles.css">
  </head>
  <body>
    <form action="/calculation" method="post">
      <div class="form-control">
        <label for="sum1">First operand</label>
        <input type="text" id="sum1" name="sum1" value="0">
      </div>
      <div class="form-control">
        <label>Operand</label>
        <select name="operator">
          <option value="+">Addition</option>
          <option value="-">Subtraction</option>
          <option value="*">Multiplication</option>
          <option value="/">Division</option>
        </select>
      </div>
      <div class="form-control">
        <label>Second operand</label>
        <input type="text" id="sum2" name="sum2" value="0">
      </div>
      <input type="submit" value="Calculate" class="btn btn-primary button">
    </form>
  </body>
</html>
