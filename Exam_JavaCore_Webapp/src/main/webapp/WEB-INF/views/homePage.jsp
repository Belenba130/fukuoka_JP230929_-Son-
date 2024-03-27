<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>homePage</title>
</head>
<body>
<h1>Show All</h1>
<table border ="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Sex</th>
        <th>Phone</th>
        <th>Birthday</th>
        <th>Image</th>
        <th>Address</th>
    </tr>
    <c:forEach var="std" items = "${students}">
        <tr>
            <th>${std.id}</th>
            <th>${std.name}</th>
            <th>${std.sex}</th>
            <th>${std.phone}</th>
            <th>${std.image}</th>
            <th>${std.birthday}</th>
            <th>${std.address}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
