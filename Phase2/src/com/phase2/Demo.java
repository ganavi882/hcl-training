package com.phase2;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","User10","gana921@gmail.com");
			String q="update student set last_name='shenoy' where student_id='CS035'";
			Statement ps=con.createStatement();
			int rs=ps.executeUpdate(q);
			
			String q2="delete from language where student_id='CS034'";
			Statement ps2=con.createStatement();
			int rs2=ps2.executeUpdate(q2);
			
			if(rs>0&&rs2>0){
				System.out.println("Updated successfully :)");
			}
			
			

	}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

}
}
