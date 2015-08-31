<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD DOCTOR</title>
  <style>
    table, th, td {
      border: 1px solid black;
    }
  </style>

</head>
<body>

<form action="/doctor/add" method="post">
  <input type="hidden" name="id" value="${doctor.id}"/> <br/>
  Last Name: <input type="text" name="firstName" value="${doctor.firstName}"/> <br/>
  First Name: <input type="text" name="lastName" value="${doctor.lastName}"/> <br/>
  Specializ: <input type="text" name="specializ" value="${doctor.specializ}"/> <br/>
  <input type="submit" name="add" value="Add"/>
</form>

</body>
</html>
