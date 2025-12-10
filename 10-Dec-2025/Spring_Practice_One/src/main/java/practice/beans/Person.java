package practice.beans;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private int id;
	private String name;
	private int age;
	private Address address;

	private List<String> languages = new ArrayList<String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person() {
		super();
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", languages="
				+ languages.toString() + "]";
	}

	public Person(int id, String name, int age, Address address, List<String> languages) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.languages = languages;
	}

}
