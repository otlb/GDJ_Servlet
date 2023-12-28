package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.winter.app.util.DBConnector;

public class EmployeesDAO {
	//사원추가
	public int add(EmployeesDTO employeesDTO)throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "INSERT INTO EMPLOYEES"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, employeesDTO.getEmployee_id());
		st.setString(2, employeesDTO.getFirst_name());
		st.setString(3, employeesDTO.getLast_name());
		st.setString(4, employeesDTO.getEmail());
		st.setString(5, employeesDTO.getPhone_number());
		st.setDate(6, employeesDTO.getHire_date());
		st.setString(7, employeesDTO.getJob_id());
		st.setDouble(8, employeesDTO.getSalary());
		st.setDouble(9, employeesDTO.getCommission_pct());
		st.setInt(10, employeesDTO.getManager_id());
		st.setInt(11, employeesDTO.getDepartment_id());
		
		int result =st.executeUpdate();
		DBConnector.disConnect(st, con);
		return result;
	}
	
	//사원급여 합계
	public Map<String, Integer> getSalry() throws Exception {
		Map<String,Integer> map = new HashMap<String, Integer>();
		Connection con = DBConnector.getConnector();
		
		String sql="SELECT SUM(SALARY) S,COUNT(EMPLOYEE_ID) C FROM EMPLOYEES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		rs.next();
		
		int sum = rs.getInt("S");
		int count = rs.getInt("C");
		
		map.put("count", count);
		map.put("sum", sum);
		
		DBConnector.disConnect(rs, st, con);
		return map;	
		
	}
	//전체 조회
		public List<EmployeesDTO> getList() throws Exception {
			//배열, List, Set, Map
			ArrayList<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
			
			//1. 정보 선언 2. DB 연결
			Connection con = DBConnector.getConnector();
			
			//3. SQL(Query)문 생성
			String sql ="SELECT * FROM EMPLOYEES";
			
			//4. 미리 전송
			PreparedStatement st = con.prepareStatement(sql);
			
			//5. ? 값 세팅
			
			//6. 최종 전송 및 결과 처리
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				EmployeesDTO employeeDTO = new EmployeesDTO();
				employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
				employeeDTO.setFirst_name(rs.getString("FIRST_NAME"));
				
				ar.add(employeeDTO);
				
			}
			
			//7. 연결 해제
			DBConnector.disConnect(rs, st, con);
			
			return ar;
			
		}

}
