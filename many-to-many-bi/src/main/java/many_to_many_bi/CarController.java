package many_to_many_bi;

import java.util.Arrays;
import java.util.List;

public class CarController {

	public static void main(String[] args) {
		CarDao dao=new CarDao();
		
		Car c1=new Car();
		Car c2=new Car();
		
		Feature f1=new Feature();
		Feature f2=new Feature();
		
		c1.setCarName("BMW");
		c1.setCarPrice(2000000.50);
		
		c2.setCarName("Breeza");
		c2.setCarPrice(1800000.90);
		
		List<Car> cars=Arrays.asList(c1,c2);
		
		f1.setFtrName("Mileage");
		f2.setFtrName("Engine Capacity");
		
		List<Feature> ftrs=Arrays.asList(f1,f2);
		
		c1.setFeature(ftrs);
		c2.setFeature(ftrs);
		
		dao.saveCar(cars, ftrs);
		
		

	}

}
