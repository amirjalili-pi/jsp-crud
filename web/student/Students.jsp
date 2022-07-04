<%--
  Created by IntelliJ IDEA.
  User: Amirmahdi
  Date: 4/27/2022
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student</title>
    <style>
        h1 {
            text-align: center;
        }

        .item {
            text-align: center;
        }

        .row {
            padding: 5% 20% 2% 20%;
            align-content: space-around;

        }

        .item {
            margin: 6px;
        }

    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/nav/navbar.html"/>
<h1>Student List</h1>
<div class="row">
    <div class="item col-md-4 col-lg-12 col-sm-1 jumbotron">

        <table class="table table-hover table-dark">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Firstname</th>
                <th scope="col">Lastname</th>
                <th scope="col">Email</th>
                <th scope="col">Course Id</th>
                <th scope="col">Course Title</th>
                <th scope="col">Delete</th>
                <th scope="col">Update</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="students" items="${studentList}">
                <tr>
                    <td>${students.id}</td>
                    <td>${students.firstName}</td>
                    <td>${students.lastName}</td>
                    <td>${students.email}</td>
                    <td>${students.course.id}</td>
                    <td>${students.course.title}</td>
                    <td><a class="btn btn-danger" href="${pageContext.request.contextPath}/delete?id=${students.id}" role="button">Delete</a></td>
                    <td><a class="btn btn-warning" href="${pageContext.request.contextPath}/update?id=${students.id}" role="button">Update</a></td>

                </tr>
            </c:forEach>

            </tbody>
        </table>

        <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/add" role="button">Add</a>

    </div>
</div>




</body>
</html>
