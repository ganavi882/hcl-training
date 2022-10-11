package hibernateauto;

import java.util.List;
import java.util.Scanner;

public class CustomerAutoVController {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CustomerAuto cus;
		CutomerDaoAuto cusdao=new CutomerDaoAuto();
		while(true){	
			System.out.println("\n1:Insert\t 2:update\t 3:delete\t 4:list\t 5:exit");
			System.out.println("Enter your choice");
			int c=s.nextInt();

			switch(c){
			case 1: 
				cus=new CustomerAuto();
				System.out.println("Name");
				cus.setName(s.next());
				System.out.println("Enter email");
				cus.setEmail(s.next());
				cusdao.saveCustomer(cus);
				break;
				
			case 2:
				cus=new CustomerAuto();
				System.out.println("Enter Customer id");
				int id=s.nextInt();
				System.out.println("Enter new Customer name");
				String name=s.next();
				cusdao.updateCustomer(id,name);
				break;
				
			case 3:
				cus=new CustomerAuto();
				System.out.println("Enter Customer id");
				int id1=s.nextInt();
				cusdao.deleteCustomer(id1);
				break;
				
			case 4:
				List<CustomerAuto> autos =cusdao.displayAll();
				autos.forEach(a -> System.out.println(a.getId() + "\n" + a.getName() + "\n" + a.getEmail() + "\n"));
				
				break;
				
			case 5:System.exit(0);
				
		}

	}
}
}


