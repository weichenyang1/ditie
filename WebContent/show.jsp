<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
	div{ margin-left: 300px;}
</style>
</head>
<body>
		<div>
			<table border="1px">
				<tr>
					<th>线路名称</th>
					<th>始发站</th>
					<th>终点站</th>
					<th>途径站点数</th>
					<th>首车时间</th>
					<th>票价</th>
				</tr>
				<c:forEach var="su" items="${arr}">
					<tr>
						<td><a href=" name=${su.name}">${su.name }</a></td>
						<td>${su.sf}</td>
						<td>${su.zd}</td>
						<td>${su.count}</td>
						<td>${su.first}</td>
						<td>${su.price}</td>
					</tr>
				</c:forEach>
			</table>
			<a href="insert.jsp">新增线路</a>
		</div>
		

</body>
</html>