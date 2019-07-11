<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %> 
    <%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>


<c:if test="${info!=null}">
<form action="update" method="post">
<input type="hidden" name="id" value="${info.id}"><!--有该值但是不显示   -->
</c:if>

<c:if test="${info==null}">
<form action="insert" method="post">

</c:if>
	<input name="name" value="${info.name}">
	

	<select name="sex">
	
	<c:forEach items="${sexs}" var="r" varStatus="v">
	
	<c:if test="${info.sex!=v.index}">
	<option value="${v.index}">${r}</option> 
	</c:if>
	
	
	<c:if test="${info.sex==v.index}">
	<option selected="selected" value="${v.index}">${r}</option> 
	</c:if>
	
	</c:forEach>
	</select>
	
<select name="classid">
	<c:forEach items="${classlist}" var="r" >
	<c:if test="${info.classid!=r.id}">
	<option value="${r.id}">${r.name}</option>
	</c:if>
	<c:if test="${info.classid==r.id}">
	<option selected="selected" value="${r.id}">${r.name}</option>
	</c:if>
	
	</c:forEach>
	</select>
	
	
	<button type="submit">保存</button>
</form>

</body>
</html>