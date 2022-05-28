<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 22/11/2021
  Time: 4:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
          integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <table id="contractTable" class="table table-striped table-bordered table-hover table-responsive-md">
        <thead>
        <tr>
            <th colspan="8"><h3 style="font-family: sans-serif; text-align: center;">Contract List</h3></th>
        </tr>
        <tr style="background-color: #046056; color: #fff">
            <th>Case Record ID</th>
            <th>Patient ID</th>
            <th>Patient Name</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Hospitalized Reason</th>
            <th class="text-center">
                <a href="#" style="color: #fff;"><i class="far fa-plus-square"></i></a>
            </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${patientList}" var="patient">
            <tr>
                <td>${patient.caseRecord.case_record_id}</td>
                <td>${patient.patient_id}</td>
                <td>${patient.patient_name}</td>
                <td>${patient.caseRecord.case_record_start_date}</td>
                <td>${patient.caseRecord.case_record_end_date}</td>
                <td>${patient.caseRecord.hospitalized_reason}</td>
                <td class="text-center">
                    <a href="#" style="color: #fff;"><i class="fas fa-edit text-primary"></i></a>
                    <a href="#"><i class="far fa-trash-alt text-danger"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
