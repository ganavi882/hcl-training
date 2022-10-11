package org.prepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employeeconnection.EmployeeConnection;

public class EmployeeDao {
	Connection connection;
		public Employee saveEmployee(Employee emp){
			connection=EmployeeConnection.getConnection();
			String insert="insert into emp values(?,?,?,?)";
			
			try {
				PreparedStatement ps=connection.prepareStatement(insert);
				ps.setInt(1, emp.id);
				ps.setString(2, emp.name);
				ps.setString(3, emp.email);
				ps.setDouble(4, emp.salary);
				ps.execute();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return emp;
			
		}
		
		public Employee updateEmployee(Employee emp){
			connection=EmployeeConnection.getConnection();
			String update="update emp set email=? where id=?";
			try {
				PreparedStatement ps2=connection.prepareStatement(update);
				ps2.setString(1, emp.email);
				ps2.setInt(2, emp.id);
				ps2.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return emp;
			
			
		}
		
			public void getAllEmployee() {
				
				connection=EmployeeConnection.getConnection();
				String list="select * from emp";
				PreparedStatement ps3;
				try {
					ps3 = connection.prepareStatement(list);
					ResultSet rs=ps3.executeQuery();
					while(rs.next()){
						System.out.print("ID:"+rs.getInt(1)+"\t");
						System.out.print("Name:"+rs.getString(1)+"\t\t");
						System.out.print("Email:"+rs.getString(1)+"\t");
						System.out.println("Salary:"+rs.getDouble(1)+"\t");
						
				
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void deleteEmployee(int id){
				connection=EmployeeConnection.getConnection();
				String delete="delete from emp where id=?";
				try {
					PreparedStatement ps4=connection.prepareStatement(delete);
					
					ps4.setInt(1, id);
					int i=ps4.executeUpdate();
					if(i>0){
						System.out.println("***data deleted***");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		

//		public Employee getById(int id){
//			
//		}
		
		
		
	}

	


