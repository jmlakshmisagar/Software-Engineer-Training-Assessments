package practice.model;

public class User {
	private String name;
	private String password;
	private String role;
	private int id;

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String name, String password, String role, int id) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
		this.id = id;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", role=" + role + ", id=" + id + "]";
	}
}
