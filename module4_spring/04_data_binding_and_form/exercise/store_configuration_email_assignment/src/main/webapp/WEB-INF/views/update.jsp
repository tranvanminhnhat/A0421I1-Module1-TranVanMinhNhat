<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 06/12/2021
  Time: 10:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form:form action="/update" method="post" modelAttribute="electronicMailBox">
    <div>
        <form:label path="language">Languages: </form:label>
        <form:select path="language">
            <form:option value="English">English</form:option>
            <form:option value="Vietnamese">Vietnamese</form:option>
            <form:option value="Japanese">Japanese</form:option>
            <form:option value="Chinese">Chinese</form:option>
        </form:select>
    </div>
    <div>
        <form:label path="size">Page Size</form:label>
        <form:select path="size">
            <form:option value="5">5</form:option>
            <form:option value="10">10</form:option>
            <form:option value="15">15</form:option>
            <form:option value="25">25</form:option>
            <form:option value="50">50</form:option>
            <form:option value="100">100</form:option>
        </form:select>
    </div>
    <div>
        <form:label path="spam">Spams filter</form:label>
        Enable Spam Filter<form:checkbox path="spam"></form:checkbox>
    </div>
    <div>
        <form:label path="signature">Signature</form:label>
        <form:input path="signature"></form:input>
    </div>
    <div>
        <form:button>Update</form:button>
        <form:button>Cancel</form:button>
    </div>
</form:form>
</body>
</html>
