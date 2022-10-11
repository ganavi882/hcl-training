package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int panID;
	private String panNo;
	private String panAddress;
	
	@OneToOne
	@JoinColumn()
	private Person person;

	public int getPanID() {
		return panID;
	}

	public void setPanID(int panID) {
		this.panID = panID;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getPanAddress() {
		return panAddress;
	}

	public void setPanAddress(String panAddress) {
		this.panAddress = panAddress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

}
