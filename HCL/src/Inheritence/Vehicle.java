package Inheritence;

public class Vehicle {
	private String engine;
	private String model;
	private int wheels;
	public Vehicle() {
		engine="petrol";
		model="xyz";
		wheels=1;
	}
	
	
	public Vehicle(String engine, String model, int wheels) {
		super();
		this.engine = engine;
		this.model = model;
		this.wheels = wheels;
	}


	public String getEngine() {
		return engine;
	}
	public String getModel() {
		return model;
	}
	public int getWheels() {
		return wheels;
	}
	
	
	
	
	

}
