package practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	private String name;
	private String password;
	private String role;

	@Id
	private int id;

	public User() {
	}

	public User(String name, String password, String role, int id) {
		this.name = name;
		this.password = password;
		this.role = role;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", role=" + role + ", id=" + id + "]";
	}
}
