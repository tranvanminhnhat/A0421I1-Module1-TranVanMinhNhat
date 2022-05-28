<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 25/10/2021
  Time: 8:37 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2>Currency Converter</h2>
<form method="get" action="converter.jsp" class="row">
    <div class="col-lg-3">
        <div class="mb-3">
            <label for="rate" class="form-label">Rate</label>
            <input type="text" class="form-control" name="rate" id="rate" aria-describedby="emailHelp">
            <label for="usd" class="form-label">USD</label>
            <input type="text" class="form-control" name="usd" id="usd" aria-describedby="emailHelp">
        </div>
        <button type="submit" class="btn btn-primary">Convert</button>
    </div>
</form>
</body>
</html>
