<%--
  Created by IntelliJ IDEA.
  User: Amirmahdi
  Date: 5/10/2022
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <jsp:include page="/nav/navbar.html"/>
    <meta charset="UTF-8">
    <title>Add Course</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .jumbotron {
            padding: 4% 35%;
        }
    </style>
</head>
<body>
<div class="jumbotron">
    <form action="${pageContext.request.contextPath}/teachers/add" method="POST">
        <div class="form-group">
            <label>title</label>
            <input type="text" class="form-control" name="title">
        </div>
        <div class="form-group">
            <label>Teacher</label>
            <select name="teacher">
                <c:forEach var="teacher" items="${teachers}">
                    <option value="${teacher.id}">${teacher.firstName} ${teacher.lastName}</option>
                </c:forEach>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Confirm identity</button>

    </form>
</div>

</body>
</html>