package com.alvs.one_to_many_uni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MobileController {
	static Mobile mob = new Mobile();

	static Sim sim = new Sim();
	static Sim sim2 = new Sim();
	static MobileDao dao = new MobileDao();

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("\n1:Insert\t 2:delete\t 3:getInfo\t 4:update\t 5:exit");
			System.out.println("Enter your choice");
			int c = s.nextInt();

			switch (c) {
			case 1:
				sim.setProvider("Airtel");
				sim.setType("mi");

				sim2.setProvider("Bsnl");
				sim2.setType("mic");

				mob.setName("Oppo");
				mob.setModel("f11");

				List<Sim> sims = Arrays.asList(sim, sim2);
				mob.setSim(sims);
				dao.saveMobile(mob, sim, sim2);
				break;

			case 2:
				System.out.println("enter the id");
				int id = s.nextInt();
				Mobile mobile = dao.deleteMobileById(id);
				break;

			case 3:
				Mobile mob = new Mobile();
				System.out.println("Enter the customer id");
				int id3 = s.nextInt();
				dao.getById(id3);
				break;

			case 4:
				System.out.println("Enter the id");
				int id1 = s.nextInt();
				System.out.println("Enter the provider");
				String name = s.next();
				System.out.println("Enter the sim type");
				String model = s.next();
				dao.updateById(id1, name, model);

			case 5:
				System.exit(0);
			}

		}

	}

}
