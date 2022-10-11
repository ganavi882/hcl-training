package one_to_many_bi;

import java.util.Arrays;
import java.util.List;

public class TeacherController {
	
	public static void main(String[] args) {
		
	
	Teacher teacher1=new Teacher();
	teacher1.setTchName("Kreni");
	teacher1.setTchEmail("kr@gmail.com");
	TeacherDao dao=new TeacherDao();
	
	Subject subject1=new Subject();
	subject1.setSubName("Java");
	subject1.setAuthor("Goslin");
	subject1.setTeacher(teacher1);
	
	Subject subject2=new Subject();
	subject2.setSubName("Python");
	subject2.setAuthor("Bhadhusha");
	subject2.setTeacher(teacher1);
	
	
	List<Subject> sub=Arrays.asList(subject1, subject2);
	teacher1.setSubject(sub);
	dao.saveTeacher(teacher1, sub);
	
	}

}
