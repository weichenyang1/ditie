<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
	div{border: solid 1px; width: 550px; margin-left: 200px; text-align: center;}
	td{ width: 100px; height: 40px;}
	table{margin-left: 100px;}
	
</style>
</head>
<body>
	<div>
	<form action="select" method="post">
		<table>
			<h1>地铁铁路详细信息</h1>
			<tr>
				<th>线路名称：</th>
				<td><input type="text" name="name" required="required"/></td>
				<td><span id="name"></span></td>
			</tr>
			<tr>
				<th>始发站：</th>
				<td><input type="text" name="sf" required="required"/></td>
				<td><span></span></td>
			</tr>
			<tr>
				<th>终点站：</th>
				<td><input type="text" name="zd" required="required" /></td>
				<td><span></span></td>
			</tr>
			<tr>
				<th>途径站点：</th>
				<td><input type="text" name="count" required="required" /></td>
				<td><span></span></td>
			</tr>
			<tr>
				<th>首车时间：</th> 										<!-- 10:20 -->
				<td><input type="text" name="first"  required="required" pattern="^[0-1]{0,1}[0-9]:[0-5][0-9]$" /></td>
				<td><span>时：分钟</span></td>
			</tr>
			<tr>
				<th>票价：</th>
				<td><input type="text" name="price" required="required"/></td>
				<td><span></span></td>
			</tr>
			<tr>
				<th>操作：</th>
				<td colspan="2"><input type="submit" /><input type="reset" /></td>
			</tr>
		</table>
		</form>
		
		<h4><a href="#">返回首页</a></h4>
	</div>

</body>
<script src="js/jquery-1.8.3.min.js"></script>
<script>
	$("[name=name]").blur(function(){
		var value = $(this).val();
		$.ajax({
			url:"cxname",
			type:"post",
			data:"name="+value,
			datatype:"text",
			success:a
		});
	});
	
	function a(data){
		$("#name").text(data);
	}

</script>
</html>