package one_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int tchId;
	private String tchName;
	private String tchEmail;
	@OneToMany(mappedBy="teacher")
	List<Subject> subject;
	public int getTchId() {
		return tchId;
	}
	public void setTchId(int tchId) {
		this.tchId = tchId;
	}
	public String getTchName() {
		return tchName;
	}
	public void setTchName(String tchName) {
		this.tchName = tchName;
	}
	public String getTchEmail() {
		return tchEmail;
	}
	public void setTchEmail(String tchEmail) {
		this.tchEmail = tchEmail;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
	
	

}
