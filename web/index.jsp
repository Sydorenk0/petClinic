<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <link rel="stylesheet" href="/style/indexStyle.css" type="text/css" media="screen" />
  <title>First page</title>
    <script src="http://yastatic.net/jquery/1.6.4/jquery.min.js"></script>
</head>
<body>
       Doctor Pet <br>
       <table>
           <tr>
      <th><a href=${pageContext.servletContext.contextPath}"/doctor/list">Doctor</a></th>
      <th><a href=${pageContext.servletContext.contextPath}"/pet/list">Pet</a></th>
       </tr>
       </table>
       <script type="text/javascript" src="indexScript.js" charset="utf-8"></script>
       <a href=${pageContext.servletContext.contextPath}"ttt.jsp">TTT</a>
</body>
</html>
