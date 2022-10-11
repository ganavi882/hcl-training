package com.Queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Que {

	public static void main(String[] args) {
		Queue<Integer> q=new ArrayBlockingQueue<>(5);
		try {
			q.remove();
			q.element();
		} catch (NoSuchElementException e1) {
			// TODO Auto-generated catch block
			System.out.println("Queue is empty");
		}
		
		try {
			q.add(10);
			q.add(20);
			q.add(30);
			q.add(40);
			q.add(50);
			q.add(60);
		}
		catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			System.out.println("Array Limit exceeded");
		}
		
		q.remove();
	for(int i:q){
		System.out.println(i);
	}
	
	System.out.println("First element is:"+q.element());
	}
}
