package org.chrome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) throws Throwable {
		
	

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "prathap");
		
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM students.new_table;");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id = rs.getInt("studentsid");
			
			System.out.println(id);
			
			String first = rs.getString("Firstname");
			
			System.out.println(first);
			
			String last = rs.getString("Lastname");
			
			System.out.println(last);
			
			int age = rs.getInt("Age");
			
			System.out.println(age);
			
			
		
	
	}
		}
	
}