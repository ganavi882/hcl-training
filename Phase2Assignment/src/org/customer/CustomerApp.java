package org.customer;

import java.util.Scanner;

import org.customer.Customer;
import org.customer.CustomerDao;

public class CustomerApp {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);

	CustomerDao dao=new CustomerDao();
	Customer custo= new Customer();
	
	while(true){	
		System.out.println("\n1:Insert\t 2:update\t 3:list\t 4:delete\t 5:exit");
		System.out.println("Enter your choice");
		int c=s.nextInt();

		switch(c){
		case 1:

			System.out.println("Enter Customer id:");
			custo.id=s.nextInt();
			
			System.out.println("Enter Customer name:");
			custo.name=s.next();
			
			System.out.println("Enter Customer phno:");
			custo.phno=s.next();
			
			
			
			Customer cust2 =dao.saveCustomer(custo);
			
			if(cust2!=null){
				System.out.println("***Data Stored***");
			}
			break;
			
		case 2:
			System.out.println("Enter Customer id:");
			custo.id=s.nextInt();
			
			System.out.println("Enter customer name:");
			custo.name=s.next();
			
			Customer cust3 =dao.updateCustomer(custo);
			
			if(cust3!=null){
				System.out.println("***Data Updated***");
			
			}
			break;

		case 3: dao.getAllCustomer();	
				break;
		case 4:
			System.out.println("Enter Customer id:");
			custo.id=s.nextInt();
			dao.deleteCustomer(custo.id);
			break;
			
		case 5: System.exit(0);
	}
	}
		
	}
}
	


