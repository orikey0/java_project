<%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/3/8
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>
</head>
<body>
<form action="updateHero" method="post">
    <table>
        name：  <input type="text" name="name" value="${hero.name}"><br>
        hp:     <input type="text" name="hp" value="${hero.hp}"><br>
        damage: <input type="text" name="damage" value="${hero.damage}"><br>
        <input type="hidden" name="id" value="${hero.id}">
        <input type="submit" value="更新">

    </table>

</form>

</body>
</html>
