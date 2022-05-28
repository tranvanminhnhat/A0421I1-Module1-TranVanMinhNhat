<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 24/10/2021
  Time: 1:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency converter</title>
    <style>
      form {
        margin-top: 40px;
        width: 250px;
        height: 220px;
        padding: 5px;
        border: 1px solid black;
      }
      label, input{
        display: block;
        width: 100%;
        margin-top: 10px;
      }
    </style>
  </head>
  <body>
    <form method="get" action="/convert">
      <div>
        <h2>Currency Converter</h2>
        <label for="rate">Rate: </label>
        <input type="text" value="0" id="rate" name="rate" placeholder="rate">
        <label for="usd">USD: </label>
        <input type="text" value="0" id="usd" name="usd">
        <input type="submit" value="Converter">
      </div>
    </form>
  </body>
</html>
