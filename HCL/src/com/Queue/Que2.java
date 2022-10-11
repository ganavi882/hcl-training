package com.Queue;

import java.util.NoSuchElementException;
import java.util.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class Que2 {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedBlockingQueue(5);
		    System.out.println(q.poll());
			q.peek();
		
		
		
			q.offer(10);
			q.offer(20);
			q.offer(30);
			q.offer(40);
			q.offer(50);
			System.out.println(q.offer(60));
			
			q.poll();
	for(int i:q){
		System.out.println(i);
	}
	
	System.out.println("First element is:"+q.peek());

	}

}
