<%--
  Created by IntelliJ IDEA.
  User: Amirmahdi
  Date: 5/1/2022
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .jumbotron {
            padding: 4% 35%;
        }
    </style>
</head>
<body>
<jsp:include page="/nav/navbar.html"/>
<c:set var="student" value="${student}"/>
<div class="jumbotron">
    <form action="${pageContext.request.contextPath}student/update?id=${student.id}" method="POST">
        <div class="form-group">
            <label>Email address</label>
            <input type="email" class="form-control" name="email" value="${student.email}">
        </div>
        <div class="form-group">
            <label>Firstname</label>
            <input type="text" class="form-control" name="firstname" value="${student.firstName}">
        </div>
        <div class="form-group">
            <label>Lastname</label>
            <input type="text" class="form-control" name="lastname" value="${student.lastName}">
        </div>
        <button type="submit" class="btn btn-primary">Update identity</button>

    </form>
</div>

</body>
</html>
