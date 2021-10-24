<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 24/10/2021
  Time: 2:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount price</title>
    <meta charset="utf-8">
    <style>
      input{
        display: block;
      }
    </style>
  </head>
  <body>
    <form method="post" action="/calculate">
      <div>
        <h2>Tính chiếc khấu</h2>
        Mô tả:<input type="text" id="pDescription" name="pDescription" placeholder="Mô tả sản phẩm">
        Giá niêm yết:<input type="text" id="listPrice" name="listPrice" placeholder="Giá niêm yết sản phẩm">
        Phần trăm chiếc khấu<input type="text" id="dPercent" name="dPercent" placeholder="Tỷ lệ chiếc khấu">
        <input type="submit" value="Calculate">
      </div>
    </form>
  </body>
</html>
