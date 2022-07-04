<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Courses</title>
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
<h1>Courses List</h1>
<div class="row">
    <div class="item col-md-4 col-lg-12 col-sm-1 jumbotron">

        <table class="table table-hover table-dark">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Title</th>
                <th scope="col">Teacher</th>
<%--                <th scope="col">Student Id</th>--%>
<%--                <th scope="col">Student Name</th>--%>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="courses" items="${courses}">
                <tr>
                    <td>${courses.id}</td>
                    <td>${courses.title}</td>
                    <td>${courses.teacher.id}</td>
<%--                    <td>--%>
<%--                        <c:if test="${courses.student.id}" >--%>
<%--                            ${courses.student.id}--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${not courses.student.id}" >--%>
<%--                            null--%>
<%--                        </c:if>--%>
<%--                    </td>--%>
<%--                    <td>${courses.student.firstName}</td>--%>
                </tr>
            </c:forEach>

            </tbody>
        </table>

        <a class="btn btn-primary" href="${pageContext.request.contextPath}/courses/add" role="button">Add</a>

    </div>
</div>


</body>
</html>
