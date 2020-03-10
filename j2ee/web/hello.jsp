<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/3/7
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
    你好 JSP

<%=new Date().toString()%>
    <%@include file="footer.jsp"%>
</body>
</html>
