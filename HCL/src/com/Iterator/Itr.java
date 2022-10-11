package com.Iterator;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Itr {

	public static void main(String[] args) {
		List<Stud> ob=new ArrayList<>();
		Stud s1=new Stud("neha", 20);
		Stud s2=new Stud("ganavi", 19);
		Stud s3=new Stud("ABC", 22);
		Stud s4=new Stud("EFG", 15);
		
		ob.add(s1);
		ob.add(s2);
		ob.add(s3);
		ob.add(s4);
		
		
		
		ListIterator<Stud> lt=ob.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
			}

	}

}
