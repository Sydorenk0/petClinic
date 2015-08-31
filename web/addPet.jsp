<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD PET</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>

</head>
<body>

<form action="/pet/add" method="post">
    <input type="hidden" name="id" value="${pet.id}"/> <br/>
    Species: <input type="text" name="species" value="${pet.species}"/> <br/>
    Alias: <input type="text" name="alias" value="${pet.alias}"/> <br/>
    Age: <input type="text" name="age" value="${pet.age}"/> <br/>
    <input type="submit" name="add" value="Add"/>
</form>

</body>
</html>
