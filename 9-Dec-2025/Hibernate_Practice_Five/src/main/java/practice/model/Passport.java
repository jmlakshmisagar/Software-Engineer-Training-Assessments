package practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Size(min = 8, message = "min of 8 charectors")
	private String passpostNumber;

	@OneToOne
	@JoinColumn(name = "person_passport_table", referencedColumnName = "id")
	private Person person;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPasspostNumber() {
		return passpostNumber;
	}

	public void setPasspostNumber(String passpostNumber) {
		this.passpostNumber = passpostNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passpostNumber=" + passpostNumber + ", person=" + person + "]";
	}

	public Passport(Long id, @Size(min = 8, message = "min of 8 charectors") String passpostNumber, Person person) {
		super();
		this.id = id;
		this.passpostNumber = passpostNumber;
		this.person = person;
	}

	public Passport() {
		super();
	}

}
