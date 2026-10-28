package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_connection1 {
	public static void main(String args[]) {

		final String URL = "jdbc:mysql://localhost:3306/Employee_Management";
		String userName = "root";
		String password = "ramyarani";
//		String query = "INSERT INTO employee VALUES (101, 'Ramya', 'SE', 500000)";
//		String query="update employee set name='Ramya Reddy' where id=101";
		String query="delete from employee where id=103";
		try {
			//Stage-1
			Connection connection = DriverManager.getConnection(URL, userName, password);
			//Stage-2
			Statement st = connection.createStatement();
			//Stage-3
			int count = st.executeUpdate(query);
			System.out.println(count);
			//Stage-5
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
