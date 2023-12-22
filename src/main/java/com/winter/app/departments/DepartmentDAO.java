package com.winter.app.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;


public class DepartmentDAO {
	
	public List<DepartmentDTO> getList() throws Exception {
	
			Connection con = DBConnector.getConnector();
		
		
			//sql문 생성
			String sql = "SELECT * FROM DEPARTMENTS";
			//전송
			PreparedStatement st = con.prepareStatement(sql);
			
			//최종전송 결과처리
			ResultSet rs = st.executeQuery();
			List<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
			while(rs.next()) {
				DepartmentDTO dto = new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
				dto.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
				dto.setManager_id(rs.getInt("MANAGER_ID"));
				dto.setLocation_id(rs.getInt("LOCATION_ID"));
				ar.add(dto);
				
			}
			//db연결 끊어주기
			DBConnector.disConnect(rs, st, con);
			return ar;
			
	}
	
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO) throws Exception {
		
		Connection con = DBConnector.getConnector();
		
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, departmentDTO.getDepartment_id());
		
		ResultSet rs = st.executeQuery();
		
		DepartmentDTO dto = null;
		
		if(rs.next()) {
			dto = new DepartmentDTO();
			dto.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			dto.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			dto.setManager_id(rs.getInt("MANAGER_ID"));
			dto.setLocation_id(rs.getInt("LOCATION_ID"));			
		}
		
		return dto;
		
	}
	
	
	
	
}
