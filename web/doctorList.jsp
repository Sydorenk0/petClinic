<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 18.08.2015
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <link rel="stylesheet" href="/style/listStyle.css" type="text/css" media="screen"/>
    <title></title>
</head>
<body>
<legend>DOCTOR LIST</legend>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>firstName</th>
        <th>lastName</th>
        <th>specializ</th>
        <th>Действие</th>
    </tr>

    </thead>
    <tbody>

    <c:forEach items="${requestScope.doctorList}" var="doctor">
        <tr>
            <td><c:out value="${doctor.id}"></c:out></td>
            <td><c:out value="${doctor.firstName}"></c:out></td>
            <td><c:out value="${doctor.lastName}"></c:out></td>
            <td><c:out value="${doctor.specializ}"></c:out></td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/doctor/edit?id=${doctor.id}">Edit</a>
                <a href="${pageContext.servletContext.contextPath}/doctor/delete?id=${doctor.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href=${pageContext.servletContext.contextPath}"/addDoctor.jsp">add new doctor</a>
</body>
</html>
