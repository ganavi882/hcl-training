package com.AutoBoxing;

import java.util.ArrayList;

class intWrapper{
	int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
	
	
}

public class Auto {

	public static void main(String[] args) {
		ArrayList<intWrapper> list=new ArrayList<intWrapper>();
		list.add(new intWrapper(10));//Boxing 
		System.out.println(list.get(0).getIntValue());//Unboxing
		
		
		ArrayList<Double> ls=new ArrayList<Double>();
		ls.add(45.5);//Autoboxing
		System.out.println(ls.get(0));
		
	}
	
	
	
	

}
