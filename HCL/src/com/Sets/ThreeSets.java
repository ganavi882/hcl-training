package com.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSets {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		for(int i=15;i>0;i--){
			set.add(i);
		}
		System.out.println();
		
		for(int j:set){
			System.out.print(j+"\t");
		}
		
		
		Set<Integer> s=new LinkedHashSet<>();
		for(int i=15;i>0;i--){
			s.add(i);
		}
		System.out.println();
		for(int j:s){
			System.out.print(j+"\t");
		}
		
		Set<Integer> st=new TreeSet<>();
		for(int i=15;i>0;i--){
			st.add(i);
		}
		System.out.println();
		for(int j:st){
			System.out.print(j+"\t");
		}

	}

}
