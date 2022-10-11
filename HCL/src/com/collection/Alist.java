package com.collection;

import java.util.ArrayList;


public class Alist {
	static ArrayList<String> list=new ArrayList<String>();
	public static void main(String args[]){
		
		list.add("Bob");
		list.add("John");
		list.add("Nick");
		list.add("Theo");
		list.add("Joe");
		list.add("Beck");
		
		
		
		Alist a=new Alist();
		a.display(list);
		
//		a.removeByPostion(1);
//		a.removeByPostion(4);
//		
//		a.removeByName("Theo");
//		a.removeByName("Beck");
		
		System.out.println("After modifying");
		
		
	
	int position=a.search("Beck");
	if(position!=-1){
		a.modifyByIndex(position,"Emma" );
		
	}
	else{
		System.out.println("Invalid Entry!!! ");
	}
	a.display(list);	
		
	}
	
	public void display(ArrayList<String> list){
		for(String name:list){
			System.out.println(name);
		}
	}

		
	
	
	void removeByPostion(int pos){
	
		list.remove(pos);
		
	}
	public void removeByName(String name){
		list.remove(name);
		
	}
	public void modifyByIndex(int ix,String newName){
		list.set(ix,newName);
	}
	public int search(String n){
		return list.indexOf(n);
	}
}


