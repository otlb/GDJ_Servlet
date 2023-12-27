<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Regions Add</h1>
	
	<form action="./addProcess.jsp">
		<div>
			<!--파라미터 이름명을 테이블명이랑 동일하게 -->
			대륙ID<input type="text" name="region_id">		
		</div>
		<div>
			대륙명<input type="text" name="region_name">		
		</div>
		<button>추가</button>
	
	</form>

</body>
</html>