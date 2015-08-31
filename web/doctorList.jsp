<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title></title>
  <style>
    table, th, td {
      border: 1px solid black;
    }
  </style>

</head>
<body>
DOCTOR LIST

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
        <a href ="${pageContext.servletContext.contextPath}/doctor/edit?id=${doctor.id}">Edit</a>
        <a href ="${pageContext.servletContext.contextPath}/doctor/delete?id=${doctor.id}">Delete</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<a href=${pageContext.servletContext.contextPath}"/addDoctor.jsp">add new doctor</a>
</body>
</html>
