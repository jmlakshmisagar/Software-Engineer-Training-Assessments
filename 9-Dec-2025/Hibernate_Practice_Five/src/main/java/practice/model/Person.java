package practice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Size(min = 3, message = "Person should have min of 3 chars")
	@NotBlank
	@NotEmpty
	@NotNull
	private String name;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;

	@Pattern(regexp = "[9876][0-9]{9}", message = "Please enter the valid valid number")
	@NotEmpty
	private String mobile;

	@Email
	@NotEmpty
	private String email;

	public Person(Long id,
			@Size(min = 3, message = "Person should have min of 3 chars") @NotBlank @NotEmpty @NotNull String name,
			Passport passport,
			@Pattern(regexp = "[9876][0-9]{9}", message = "Please enter the valid valid number") @NotEmpty String mobile,
			@Email @NotEmpty String email) {
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
		this.mobile = mobile;
		this.email = email;
	}

	public Person() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", passport=" + passport + ", mobile=" + mobile + ", email="
				+ email + "]";
	}

}
