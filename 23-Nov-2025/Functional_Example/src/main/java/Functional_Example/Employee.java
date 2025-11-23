package Functional_Example;

public class Employee {

	int id;
	String name;
	double salary;
	String department;

	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + salary + " - " + department;
	}
}
