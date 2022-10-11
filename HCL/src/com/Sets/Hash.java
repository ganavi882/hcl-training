package com.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Iterator.Stud;

public class Hash {

	public static void main(String[] args) {
		Set<Std> ob=new HashSet<>();
		Std s1=new Std("neha", 20);
		Std s2=new Std("ganavi", 19);
		Std s3=new Std("ABC", 22);
		Std s4=new Std("EFG", 15);
		
		ob.add(s1);
		ob.add(s2);
		ob.add(s3);
		ob.add(s4);
		
		System.out.println(ob);


	}

}
