package com.winter.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnector {

	//1. ip:port
	//2. id,pw

	public void getConnector() {
		String user = "user01";
		String password = "user01";
		String url="jdbc:oracle:thin:@13.124.121.63:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//1. driver를 메모리에 로딩(객체 생성)
		try {
			Class.forName(driver);
			//2. DB연결
			Connection con = DriverManager.getConnection(url, user, password);
			//3. SQL문 생성
			String sql = "SELECT * FROM REGIONS";
			//4.SQL문을 미리전송
			PreparedStatement st = con.prepareStatement(sql);
			//5.
			
			//6.최종전송 및 결과처리
			ResultSet rs = st.executeQuery();			
			while(rs.next()) {
				//첫번째 rs= 1,Europe
				int n = rs.getInt("REGION_ID");
				String name = rs.getString("REGION_NAME");
				System.out.println(n+" : "+name);
				System.out.println("===================");
			}
			
			
			System.out.println(con);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
