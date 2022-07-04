<%--
  Created by IntelliJ IDEA.
  User: Amirmahdi
  Date: 5/10/2022
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <jsp:include page="/nav/navbar.html"/>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .jumbotron{
            padding: 4% 35%;
        }
    </style>
</head>
<body>
<div class="jumbotron">
    <form action="/student/add" method="POST">
        <div class="form-group">
            <label >Email address</label>
            <input type="email" class="form-control" name="email"  placeholder="name@example.com">
        </div>
        <div class="form-group">
            <label>Firstname</label>
            <input type="text" class="form-control" name="firstname" >
        </div>
        <div class="form-group">
            <label >Lastname</label>
            <input type="text" class="form-control" name="lastname" >
        </div>
        <button type="submit" class="btn btn-primary">Confirm identity</button>

    </form>
</div>

</body>
</html>