package com.Stack;

import java.util.Stack;

public class Stk {
	public static void main(String args[]){
		Stack<Integer> st=new Stack<Integer>();
		st.push(20);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println("top of the stack:"+st.peek());
		
		for(Integer n:st){
			System.out.println(n);
		}

		
	}

}
