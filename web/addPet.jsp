<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <link rel="stylesheet" href="/style/add.css" type="text/css" media="screen"/>
    <title>ADD PET</title>
    <script src="http://yastatic.net/jquery/1.6.4/jquery.min.js"></script>
</head>

<body>
<div id="content">
    <form id='jform' action="/pet/add" method="post">
        <fieldset>
            <legend>PET LIST</legend>
            <input type="hidden" name="id" value="${pet.id}"/> <br/>

            <p>
                <label for="species" class="block">Species:</label>
                <input type="text" name="species" id="species" value="${pet.species}"/>
            </p>

            <p>
                <label for="alias" class="block">Alias:</label>
                <input type="text" name="alias" id="alias" value="${pet.alias}"/> <br/>
            </p>

            <p>
                <label for="age" class="block"> Age:</label>
                <input type="text" name="age" id="age" value="${pet.age}"/> <br/>
            </p>

            <p>
                <button type="submit" name="add" id="send" value="Add">ADD</button>
            </p>
        </fieldset>
    </form>
</div>
<!-- content -->
<script type="text/javascript" src="/scripte/petValidation.js" charset="utf-8"></script>
</body>
</html>
