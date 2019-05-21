<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: yuki.komatsu
  Date: 2019-05-21
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>switch</title>
</head>
<body>
<%
    Random random = new Random();
    int dice = random.nextInt(6) + 1;
    String result;
%>

<%--<% switch (dice) { %>--%>

<%--    <% case 1: %>--%>
<%--        <h3>BIG</h3>--%>
<%--        <% break; %>--%>

<%--    <% case 2: %>--%>
<%--        <h3>MID</h3>--%>
<%--        <% break; %>--%>

<%--    <% case 3: %>--%>
<%--        <h3>LOW</h3>--%>
<%--        <% break; %>--%>

<%--    <% default: %>--%>
<%--        <h3>Non of ...</h3>--%>
<%--        <% break; %>--%>
<%--<% } %>--%>

<% switch (dice) {
    case 1:
        result = "<h3>BIG</h3>";
        break;

    case 2:
        result = "<h3>MID</h3>";
        break;

    case 3:
        result = "<h3>LOW</h3>";
        break;

    default:
        result = "<h3>Non of ...</h3>";
        break;
} %>

<%= result %>

</body>
</html>
