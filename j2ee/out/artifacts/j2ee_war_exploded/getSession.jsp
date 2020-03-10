<%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/3/7
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = (String)session.getAttribute("name");

    %>
    sesson中的name是：<%=name%>
</body>
</html>
