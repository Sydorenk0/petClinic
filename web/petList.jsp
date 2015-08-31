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
PET LIST

<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>Species</th>
    <th>Alias</th>
    <th>Age</th>
    <th>Действие</th>
  </tr>

  </thead>
  <tbody>

  <c:forEach items="${requestScope.petList}" var="pet">
    <tr>
      <td><c:out value="${pet.id}"></c:out></td>
      <td><c:out value="${pet.species}"></c:out></td>
      <td><c:out value="${pet.alias}"></c:out></td>
      <td><c:out value="${pet.age}"></c:out></td>
      <td>
        <a href ="${pageContext.servletContext.contextPath}/pet/edit?id=${pet.id}">Edit</a>
        <a href ="${pageContext.servletContext.contextPath}/pet/delete?id=${pet.id}">Delete</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<a href=${pageContext.servletContext.contextPath}"/addPet.jsp">add new pet</a>
</body>
</html>
