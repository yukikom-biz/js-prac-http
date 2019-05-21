<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: yuki.komatsu
  Date: 2019-05-21
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>productQuestion</title>
</head>
<body>
<%!
public class Product{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
%>

<%
    Product prd = new Product("TV", 20000);
    request.setAttribute("product",prd);
%>


<h3>${product.name}</h3>
<h3>${product.price}</h3>
<%--<c:if>--%>
<%--    --%>
<%--</c:if>--%>
</body>
</html>


