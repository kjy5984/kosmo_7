<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 03_List.jsp </title>
</head>
<body>

<h2>멤버 리스트</h2>

<table boder='2'>
	<tr><td>번호</td><td>이름</td><td>나이</td></tr>
	<c:forEach var='vo' items='${memberList.list}'> 
	
		<c:if test="${vo.state}">
		<tr> 
			<td>${vo.id}</td>
			<td>${vo.name}</td>
			<td>${vo.age}</td>
		</tr>
		</c:if>
	</c:forEach>
	 
	
	

</table>

</body>
</html>