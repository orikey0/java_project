<%@ page import="java.text.CollationKey" %><%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/3/7
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie[]cookies = request.getCookies();
        if (null!=cookies){
            for (int i = 0; i < cookies.length; i++) {
                System.out.print(cookies[i].getName()+":"+cookies[i].getValue()+"<br>");
            }
        }
    %>
</body>
</html>
