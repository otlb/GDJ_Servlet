<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Department Add</h1>
	<form action="./addProcess.jsp">
		<div>
			사원ID<input type="text" name="department_id">
		</div>
		<div>
			사원이름<input type="text" name="department_name">
		</div>
		<div>
			매니저ID<input type="text" name="manager_id">
		</div>
		<div>
			로케이션ID<input type="text" name="location_id" >
		</div>
		<button>추가</button>
	</form>
	

</body>
</html>