package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read_Operations {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/Employee_Management";
		String username="root";
		String password="ramyarani";
		String query="select*from employee";
		
		
		//Stage-1
		try {
			Connection connection=DriverManager.getConnection(URL,username,password);
		//Stage-2
			Statement st=connection.createStatement();
		// Stage-3
			ResultSet rs=st.executeQuery(query);
			
			//Stage-4
			while(rs.next()) {
				int id=rs.getInt("ID");
				String name=rs.getString("Name");
				String Designation=rs.getString("Designation");
				int salary=rs.getInt("Salary");
				System.out.println(id+"\t"+name+"\t"+Designation +"\t"+salary);
				
			}
			
			//Stage-5
			connection.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
