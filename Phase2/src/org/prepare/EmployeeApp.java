package org.prepare;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);

	EmployeeDao dao=new EmployeeDao();
	Employee emplo= new Employee();
	
	while(true){	
		System.out.println("1:Insert\t 2:update\t 3:list\t 4:delete\t 5:exit");
		System.out.println("Enter your choice");
		int c=s.nextInt();

		switch(c){
		case 1:

			System.out.println("Enter employee id:");
			emplo.id=s.nextInt();
			
			System.out.println("Enter employee name:");
			emplo.name=s.next();
			
			System.out.println("Enter employee email:");
			emplo.email=s.next();
			
			System.out.println("Enter employee salary");
			emplo.salary=s.nextDouble();
			
			Employee emp2 =dao.saveEmployee(emplo);
			
			if(emp2!=null){
				System.out.println("***Data Stored***");
			}
			break;
			
		case 2:
			System.out.println("Enter employee id:");
			emplo.id=s.nextInt();
			
			System.out.println("Enter employee email:");
			emplo.email=s.next();
			
			Employee emp3 =dao.updateEmployee(emplo);
			
			if(emp3!=null){
				System.out.println("***Data Updated***");
			
			}
			break;

		case 3: dao.getAllEmployee();	
				break;
		case 4:
			System.out.println("Enter employee id:");
			emplo.id=s.nextInt();
			dao.deleteEmployee(emplo.id);
			
		case 5: System.exit(0);
	}
	}
		
	}
}
	

