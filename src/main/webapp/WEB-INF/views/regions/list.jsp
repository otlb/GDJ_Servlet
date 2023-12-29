<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//java 구역 /스크립트릿
	//RegionDAO regionDAO = new RegionDAO();
	//List<RegionDTO> ar = regionDAO.getList();
	
	//request 변수명
	List<RegionDTO> ar = (List<RegionDTO>)request.getAttribute("list");
%>    
    ${ }
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Regions List</h1>
	<table>
		<thead>
			<tr>
				<th>REGION_ID</th>
				<th>REGION_NAME</th>
			</tr>
		</thead>
		
		<tbody>
		<%for(RegionDTO dto:ar){%> <!-- 표현식 -->
			<tr>
				<td><%= dto.getRegion_id() %></td>
				<td><a href="./detail?region_id=<%= dto.getRegion_id() %>"><%= dto.getRegion_name()%></a></td>
			</tr>		
		<%}%>			
		</tbody>
	</table>
	
	<a href="./add.jsp"><h1>대륙추가<h1></a>


</body>
</html>