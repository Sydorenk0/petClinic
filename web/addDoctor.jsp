<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
  <link rel="stylesheet" href="/style/add.css" type="text/css" media="screen" />
    <title>ADD DOCTOR</title>
  </head>

<body>
<div id = "content">
<form action="/doctor/add" method="post">
  <fieldset>
    <legend>ADD DOCTOR</legend>
  <input type="hidden" name="id" value="${doctor.id}"/> <br/>
    <p>
      <label class="block">Last Name:</label>
      <input type="text" name="firstName" value="${doctor.firstName}"/>
    </p>
    <p>
      <label class="block">First Name:</label>
      <input type="text" name="lastName" value="${doctor.lastName}"/>
    </p>
    <p>
      <label class="block">Specializ:</label>
      <input type="text" name="specializ" value="${doctor.specializ}"/> <br/>
    </p>
    <p>
      <button type="submit" name="add" id = "send" value="Add">ADD</button>
    </p>

  </fieldset>
</form>
</div>
</body>
</html>
