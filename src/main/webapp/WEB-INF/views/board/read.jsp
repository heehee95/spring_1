<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>제목</th>
			<td>${boardVO.getTitle()}</td> 
		</tr>
		<tr>
			<th>내용</th>
			<td>${boardVO.getContent()}</td> 
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardVO.getWriter()}</td> 
		</tr>
		<tr>
			<th>작성일</th>
			<td>${boardVO.getRegDate()}</td> 
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardVO.getCnt()}</td> 
		</tr>
		
	</table>
	<a href="<c:url value="/board/edit/${boardVO.getSeq()}" />">수정</a>
	<a href="<c:url value="/board/list" />">목록</a>
</body>
</html>