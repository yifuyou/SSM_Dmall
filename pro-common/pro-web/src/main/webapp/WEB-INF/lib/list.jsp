<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="text-align: center;margin: 20px auto">
		<tr>
			<td>学号</td><td>姓名</td><td>性别</td>
			<td>年龄</td><td>身高</td><td>体重</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="stu">
			<tr>
				<td style="width:100px;">${stu.id}</td>
				<td style="width:100px;">${stu.name}</td>
				<td style="width:100px;">${stu.sex}</td>
				<td style="width:100px;">${stu.age}</td>
				<td style="width:100px;">${stu.height}</td>
				<td style="width:100px;">${stu.weight}</td>
				<td style="width:100px;">
					<a href="student?operator=update&id=${stu.id}">修改</a>
					<a href="student?operator=delete&id=${stu.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>