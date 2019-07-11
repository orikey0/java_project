<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	
	<div class="login">
		<input class="input" placeholder="用户名">
		<input class="input"placeholder="密码">

		<div class="btplane">	
			<button class="bt">登录</button>
			<button class="bt">关闭</button>
		</div>
	</div>
	
	<c:forEach items="${info}" var ="r" varStatus="v">
	${v.index}-----${r}
	</c:forEach>
	<c:if test="${v.index}==1">
	111111<br>1111
	</c:if>
</body>
</html>