<%--
  Created by IntelliJ IDEA.
  User: yuki.komatsu
  Date: 2019-05-21
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestInfo</title>
</head>
<body>
<h1>Request Information</h1>
<ul>
    <li>remote IP : <%= request.getRemoteAddr()%></li>
    <li>URI : <%= request.getRequestURI() %></li>
    <li>HTTP : <%= request.getMethod() %></li>
    <li>Agent : <%= request.getHeaders("User-Agent") %> </li>
    <li>AcceptFile : <%= request.getHeader("Accept") %></li>
    <li>Language : <%= request.getHeader("Accept-language") %></li>
</ul>
</body>
</html>
