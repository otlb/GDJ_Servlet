package com.winter.app.test;

import java.util.List;
import java.util.Map;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;
import com.winter.app.employees.EmployeesDAO;
import com.winter.app.employees.EmployeesDTO;
import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;
import com.winter.app.util.DBConnector;
import com.winter.app.views.View;

public class AppMain {

	public static void main(String[] args) throws Exception {
//		View view = new View();
//		DBConnector connector = new DBConnector();
//		connector.getConnector();
//		DepartmentsDAO dao = new DepartmentsDAO();
//		dao.getList();
		
//		DepartmentDAO departmentDAO = new DepartmentDAO();
//		List<DepartmentDTO> ar = departmentDAO.getList();
//		view.departmentview(ar);
//		DepartmentDTO departmentDTO = new DepartmentDTO();
//		departmentDTO.setDepartment_id(100);
//		departmentDTO = departmentDAO.getDetail(departmentDTO);
//		if(departmentDTO!=null) {
//			System.out.println(departmentDTO.getDepartment_name()+" : "+departmentDTO.getManager_id()+" : "+departmentDTO.getLocation_id());
//		}else {
//			System.out.println("DEPARTMENT_ID 없음");
//		}		
		
		
//		RegionDAO regionDAO = new RegionDAO();
//		List<RegionDTO> ar = regionDAO.getList();
//		view.regionview(ar);
		

//		RegionDTO regionDTO = new RegionDTO();
//		regionDTO.setRegion_id(1);
//		regionDTO = regionDAO.getDetail(regionDTO);
//		
//		if(regionDTO!=null) {
//			System.out.println(regionDTO.getRegion_name());
//		}else {
//			System.out.println("없는 ID");
//		}
		
		EmployeesDAO employeeDAO = new EmployeesDAO();
//		Map<String, Integer> map = employeeDAO.getSalry();
//		System.out.println(map.get("count"));
//		System.out.println(map.get("sum"));
//		System.out.println(map);
		EmployeesDTO employeesDTO = new EmployeesDTO();
		int result = employeeDAO.add(employeesDTO);
		
	}

}
