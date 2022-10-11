package Contructor;

public class Car {
	private String driver;
	private String door;
	private String engine;
	private int speed;
	
	public Car(String driver,String door,String engine,int speed){
		this.driver=driver;
		this.door=door;
		this.engine=engine;
		this.speed=speed;
		
	}
	
	public void run(){
		if(driver=="seated"&&
		door=="closed"&&
		engine=="on"&&
		speed>0){
			System.out.println("Running");
		}	
			else
				System.out.println("Not running");
				
	

}
	
}
	
