package many_to_many_bi;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Feature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ftrId;
	private LocalDateTime dateTime;
	private String ftrName;
	@ManyToMany
	@JoinTable(name="my_cars_id")
	joinColumn=@JoinColumn(name="car_features_id")
	inverseJoinColumns=@JoinColumn(name="cars_id")
	private List<Car> car;

	public int getFtrId() {
		return ftrId;
	}

	public void setFtrId(int ftrId) {
		this.ftrId = ftrId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getFtrName() {
		return ftrName;
	}

	public void setFtrName(String ftrName) {
		this.ftrName = ftrName;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

}
