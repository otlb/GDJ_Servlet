package com.winter.app.views;

import java.util.List;

import com.winter.app.departments.DepartmentDTO;
import com.winter.app.regions.RegionDTO;

public class View {

	//Regions를 출력
	public void regionview(List<RegionDTO> ar) {
		
		for(RegionDTO rg:ar) {
			System.out.println(rg.getRegion_id()+" : "+rg.getRegion_name());
			System.out.println("=========================================");
		}		
	}
	
	public void departmentview(List<DepartmentDTO> ar) {
		for(DepartmentDTO dt:ar) {
			System.out.println(dt.getDepartment_id()+" : "+dt.getDepartment_name()+" : "+dt.getManager_id()+" : "+dt.getLocation_id());
			System.out.println("====================================================================================================");
			
		}
		
	}	
	
}
