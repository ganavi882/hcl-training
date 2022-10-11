package one_to_one_bi;

public class PersonController {

	public static void main(String[] args) {
		Person per=new Person();
		PersonDao dao=new PersonDao();
		Pan pan=new Pan();
		
		per.setPersonName("Lino");
		per.setPersonEmail("ln@gmail.com");
		
		pan.setPanNo("9999999");
		pan.setPanAddress("Chennai");
		
		pan.setPerson(per);
		dao.savePerson(per, pan);

	}

}
