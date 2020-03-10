<%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/3/7
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        pageContext.setAttribute("name","gareen");
        request.setAttribute("name","temmo");
    %>
    <%
        response.sendRedirect("getContext.jsp");
    %>

</body>
</html>
