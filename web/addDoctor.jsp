<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <link rel="stylesheet" href="/style/add.css" type="text/css" media="screen"/>
    <title>ADD DOCTOR</title>
    <script src="http://yastatic.net/jquery/1.6.4/jquery.min.js"></script>
</head>

<body>
<div id="content">
    <form id = "jform" action="/doctor/add" method="post">
        <fieldset>
            <legend>ADD DOCTOR</legend>
            <input type="hidden" name="id" value="${doctor.id}"/> <br/>

            <p>
                <label for = "firstName" class="block">First Name:</label>
                <input type="text" name="firstName" id = "firstName" value="${doctor.firstName}"/>
            </p>

            <p>
                <label for = "lastName" class="block">Last Name:</label>
                <input type="text" name="lastName" id = "lastName" value="${doctor.lastName}"/>
            </p>

            <p>
                <label for ="specializ" class="block">Specializ:</label>
                <input type="text" name="specializ" id = "specializ" value="${doctor.specializ}"/> <br/>
            </p>

            <p>
                <button type="submit" name="add" id="send" value="Add">ADD</button>
            </p>

        </fieldset>
    </form>
</div>
<script type="text/javascript" src="/scripte/doctorValidation.js" charset="utf-8"></script>
</body>
</html>
