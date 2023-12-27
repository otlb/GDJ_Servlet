<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DepartmentDAO departmentDAO = new DepartmentDAO();
	DepartmentDTO departmentDTO = new DepartmentDTO();
	
	String name = request.getParameter("department_id");
	int num =  Integer.parseInt(name);
	
	departmentDTO.setDepartment_id(num);
	departmentDTO = departmentDAO.getDetail(departmentDTO);
	
	

%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Department Detail</h1>
	<table border='1'>
		<thead>
			<tr>
				<th>DEPARTMENT_ID</th>
				<th>DEPARTMENT_NAME</th>
				<th>MANAGER_ID</th>
				<th>LOCATION_ID</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%= departmentDTO.getDepartment_id()%></td>
				<td><%= departmentDTO.getDepartment_name()%></td>
				<td><%= departmentDTO.getManager_id()%></td>
				<td><%= departmentDTO.getLocation_id()%></td>
			</tr>
		
		</tbody>	
	
	</table>
	<input id="hd" type="hidden" value="<%= departmentDTO.getDepartment_id()%>">
	<button id="btn">수정</button>
	
	<script type="text/javascript">
		let btn = document.getElementById("btn");
		let hd = document.getElementById("hd");
		
		btn.addEventListener("click",function(){
			//alert(hd.value);
			location.href="./update.jsp?department_id="+hd.value;
		});
		
		
	</script>

</body>
</html>