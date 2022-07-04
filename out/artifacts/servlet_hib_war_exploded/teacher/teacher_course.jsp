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
<h1>Teachers List</h1>
<div class="row">
    <div class="item col-md-4 col-lg-12 col-sm-1 jumbotron">

        <table class="table table-hover table-dark">
            <thead>
            <tr>
                <th scope="col">Course Id</th>
                <th scope="col">Course title</th>
                <%--                <th scope="col">Lastname</th>--%>
                <%--                <th scope="col">Course List</th>--%>

            </tr>
            </thead>
            <tbody>
            <%--                <c:choose>--%>
            <c:forEach var="course" items="${course}">
                <tr>
                    <td>${course.id}</td>
                    <td>${course.title}</td>
                </tr>
            </c:forEach>
            <%--                    <c:otherwise>--%>
            <%--                        <tr>--%>
            <%--                            <td>No Data...</td>--%>
            <%--                        </tr>--%>
            <%--                    </c:otherwise>--%>
            <%--                </c:choose>--%>
            </tbody>
        </table>
        <%--        <a href="${pageContext.request.contextPath}/teachers/add" class="btn btn-primary" role="button">Add</a>--%>
    </div>
</div>


</body>
</html>
