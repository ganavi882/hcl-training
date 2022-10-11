package Inheritence;

public class Bike extends Vehicle {
	private String handle;
//	public Bike() {
////		super();
//		this.handle="ggg";
//	}
	
	
	public Bike(String handle,String engine, String model, int wheels) {
		super(engine,model,wheels);
		this.handle = handle;
	}


	public String getHandle() {
		return handle;
	}


	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getModel()=" + getModel()
				+ ", getWheels()=" + getWheels() + "]";
	}
	
	

	
	
	
	

}
