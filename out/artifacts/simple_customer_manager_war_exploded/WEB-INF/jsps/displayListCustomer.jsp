<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/1/2020
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customer List:</h1>
<table width="100%" border="1px">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>DateOfBirth</th>
        <th>Image</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <th>${customer.getIdCus()}</th>
            <th>${customer.getNameCus()}</th>
            <th>${customer.getDateOfBirth()}</th>
            <th><img src="${customer.getImage()}"/></th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
