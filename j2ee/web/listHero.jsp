<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/3/10
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>listHero</title>
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <script>
        $(function () {
            $("a").addClass("btn btn-default btn-xs");
        })
    </script>
</head>
<body>
<table style="width:500px; margin:44px auto" class="table table-striped table-bordered table-hover  table-condensed" align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>hp</td>
            <td>damage</td>
            <td>edit</td>
            <td>delete</td>
        </tr>
        <c:forEach items="${heros}" var="hero" varStatus="st">
            <tr>
                <td>${hero.id}</td>
                <td>${hero.name}</td>
                <td>${hero.hp}</td>
                <td>${hero.damage}</td>
                <td><a href="editHero?id=${hero.id}">edit</a></td>
                <td><a href="deleteHero?id=${hero.id}">delete</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="center">
                <a href="?start=0">[首  页]</a>
                <a href="?start=${pre}">[上一页]</a>
                <a href="?start=${next}">[下一页]</a>
            </td>
        </tr>

    </table>
</body>
</html>
