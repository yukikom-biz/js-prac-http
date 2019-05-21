<%@ page import="MVC.Circle" %><%--
  Created by IntelliJ IDEA.
  User: yuki.komatsu
  Date: 2019-05-21
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Circle circle = (Circle) request.getAttribute("circle");
    String result = "";
%>

<html>
<head>
    <title>circleResult</title>
</head>
<body>
<h1>Result</h1>
<% switch (circle.getCalcType()){
    case "cL":
        result = "Length is";
        break;
    case "cS":
        result = "Area is";
        break;
    default:
        result = "EmptySet";
        break;
}%>
<h2><%= result %></h2>
<h3>${circle.result}</h3>
</body>
</html>
