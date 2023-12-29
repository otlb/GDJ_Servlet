<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//RegionDTO regionDTO = new RegionDTO();
	//RegionDAO regionDAO = new RegionDAO();
	
	//String n = request.getParameter("region_id");
	//int num = Integer.parseInt(n);
	
	//regionDTO.setRegion_id(num);
	//regionDTO = regionDAO.getDetail(regionDTO);
	
	//RegionDTO regionDTO = (RegionDTO)request.getAttribute("detail");

%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Region Detail</h1>	
	<h3>${requestScope.detail.region_id}</h3>
	<h3>${requestScope.detail.region_name}</h3>
	<input id="hd" type="hidden" value="${requestScope.detail.region_id}">
	<button id="btn">수정</button>
	
	<script type="text/javascript">
		let btn = document.getElementById("btn");
		let hd = document.getElementById("hd");
		
		btn.addEventListener("click",function(){
			//alert(hd.value);
			location.href="./update.jsp?region_id="+hd.value;
		});
		
		
	</script>

</body>
</html>