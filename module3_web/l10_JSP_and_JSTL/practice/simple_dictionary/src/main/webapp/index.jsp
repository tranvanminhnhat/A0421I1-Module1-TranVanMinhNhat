<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 25/10/2021
  Time: 8:51 SA
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="dictionary.jsp" method="post" class="row ">
    <div class="col-lg-3">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">English words</label>
            <input type="text" class="form-control" name="search" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <button type="submit" class="btn btn-primary">Translate</button>
    </div>
</form>
</body>
</html>
