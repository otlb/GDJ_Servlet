<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	DepartmentDTO departmentDTO = new DepartmentDTO();
	DepartmentDAO departmentDAO = new DepartmentDAO();
	
	String id = request.getParameter("department_id");
	
	departmentDTO.setDepartment_id(Integer.parseInt(id));
	
	departmentDTO = departmentDAO.getDetail(departmentDTO);

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Update page</h1>
	<form action="./updateProcess.jsp">
		<div>
			사원ID<input readonly="readonly" type="text" name="department_id" value="<%=departmentDTO.getDepartment_id()%>">
		</div>
		<div>
			부서이름<input type="text" name="department_name" value="<%= departmentDTO.getDepartment_name() %>" >
		</div>
		<div>
			매니저ID<input readonly="readonly" type="text" name="manager_id" value="<%= departmentDTO.getManager_id()%>">
		</div>
		<div>
			로케이션ID<input readonly="readonly" type="text" name="location_id" value="<%= departmentDTO.getLocation_id() %>" >
		</div>
		<button>수정</button>
	</form>
	


</body>
</html>