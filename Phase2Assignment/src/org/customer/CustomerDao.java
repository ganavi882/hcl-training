package org.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.customerconnection.CustomerConnection;

public class CustomerDao {
	Connection connection;
		public Customer saveCustomer(Customer cust){
			connection=CustomerConnection.getConnection();
			String insert="insert into cus values(?,?,?)";
			
			try {
				PreparedStatement ps=connection.prepareStatement(insert);
				ps.setInt(1, cust.id);
				ps.setString(2, cust.name);
				ps.setString(3, cust.phno);
			
				ps.execute();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return cust;
			
		}
		
		public Customer updateCustomer(Customer cust){
			connection=CustomerConnection.getConnection();
			String update="update cus set name=? where id=?";
			try {
				PreparedStatement ps2=connection.prepareStatement(update);
				ps2.setString(1, cust.name);
				ps2.setInt(2, cust.id);
				ps2.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return cust;
			
			
		}
		
			public void getAllCustomer() {
				
				connection=CustomerConnection.getConnection();
				String list="select * from cus";
				PreparedStatement ps3;
				try {
					ps3 = connection.prepareStatement(list);
					ResultSet rs=ps3.executeQuery();
					while(rs.next()){
						System.out.print("ID:"+rs.getInt(1)+"\t");
						System.out.print("Name:"+rs.getString(2)+"\t");
						System.out.println("Phone No:"+rs.getString(3)+"\t");
						
				
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void deleteCustomer(int id){
				connection=CustomerConnection.getConnection();
				String delete="delete from cus where id=?";
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



