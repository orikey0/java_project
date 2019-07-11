<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i =1;i<10;i++)
	{
		for(int j=1;j<=i;j++){
			
			out.write(j+"*"+i+"="+i*j+"&nbsp&nbsp&nbsp");
		}
		out.write("<br>");
	}
%>


<a href="http://www.google.com" target="_new">谷歌</a>
<img alt="" src="E:/好看的图片/1.jpg" width="200" height="500">
<form action="aa" method="post">
<input type="date" name="bookname" value="123">
<input type="submit" >
<textarea rows="6" cols="8"></textarea>
<select sex>
<option value="0">男</option>
<option value = "1">女</option>
</select>
<input type="text">
</form> 

<div></div>
<span></span>

<ul></ul>

<li></li>
<td>333<tr>333</tr></td>



</body>
</html>