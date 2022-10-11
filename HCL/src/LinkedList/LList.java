package LinkedList;

import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		LinkedList<Student> ll=new LinkedList<>();
		
		Student s1=new Student("neha",78);
		Student s2=new Student("ganavi",22);
		
		ll.add(s1);
		ll.add(s2);
		
		System.out.println(ll.get(0).toString());
		System.out.println(ll.get(1).toString());

		
		
	}
	
}
