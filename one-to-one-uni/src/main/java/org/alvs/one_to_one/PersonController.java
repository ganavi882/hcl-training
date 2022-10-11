package org.alvs.one_to_one;

import java.util.Scanner;



public class PersonController {
	static Person person=new Person();
	static Adhar adhar=new Adhar();
	static PersonDao dao=new PersonDao();
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("\n1:Insert\t 2:update\t 3:delete\t 4:list\t 5:exit");
			System.out.println("Enter your choice");
			int c=s.nextInt();

			switch(c){
			case 1: 
			adhar.setAdharNo(6987087997389787892l);
			adhar.setAddress("Bengaluru");
			
			person.setName("Mack");
			person.setEmail("mc@gmail.com");
			person.setAdhar(adhar);
			dao.savePerson(person, adhar);
			break;
			
			case 2:
				dao.updateCustomer(1, "Mathew", 9999999990000000l);
				break;
				
			case 3:
					dao.deleteById(2);
			break;
				
			case 4:
				Person person=dao.getDetails(1);
				System.out.println("Person Details");
				System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getEmail()+"\t");
				System.out.println("Adhar details");
				System.out.println(person.getAdhar().getId());
				System.out.println(person.getAdhar().getAdharNo());
				System.out.println(person.getAdhar().getAddress());
				
			case 5:System.exit(0);
			}
			
		}

	}
	

}
