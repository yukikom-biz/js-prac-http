<%--
  Created by IntelliJ IDEA.
  User: yuki.komatsu
  Date: 2019-05-21
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>circle</title>
</head>
<body>
<h2>Input circle radius.</h2>
<form action="${pageContext.request.contextPath}/ServletCircle" method="post">
    radius: <input type="text" name="radius">
    <input type="radio" name="calcType" value="cL">Circumferential length
    <input type="radio" name="calcType" value="cS">surface　area
    <input type="submit" value="send">
</form>
</body>
</html>
