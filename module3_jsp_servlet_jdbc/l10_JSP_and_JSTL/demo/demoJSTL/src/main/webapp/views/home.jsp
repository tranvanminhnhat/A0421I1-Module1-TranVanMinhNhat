<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/25/2021
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Trang chủ</h1>
<h2>Hiên thị danh sách sinh viên</h2>
<table>
    <tr>
        <th>STT</th>
        <th>id</th>
        <th>Tên</th>
        <th>Gới tính</th>
        <th>Điểm</th>
        <th>Xếp loại</th>
    </tr>
    <c:forEach items="${list}" var="student" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${student.id}</td>
            <td><c:out value="${student.name}"></c:out></td>
            <c:if test="${student.gender}">
                <td>Nam</td>
            </c:if>
            <c:if test="${!student.gender}">
                <td>Nu</td>
            </c:if>
            <td>${student.point}</td>
            <c:choose>
                <c:when test="${student.point<5}">
                    <td>Yếu</td>
                </c:when>
                <c:when test="${student.point<7}">
                    <td>TB</td>
                </c:when>
                <c:when test="${student.point<8}">
                    <td>Khá</td>
                </c:when>
                <c:otherwise>
                    <td>Giỏi</td>
                </c:otherwise>
            </c:choose>
        </tr>
    </c:forEach>
</table>
</body>
</html>
