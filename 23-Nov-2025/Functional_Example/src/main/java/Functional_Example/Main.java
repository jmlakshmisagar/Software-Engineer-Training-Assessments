package Functional_Example;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Employee list
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Lakshmi", 80000, "IT"));
		employees.add(new Employee(2, "Rohan", 50000, "Finance"));
		employees.add(new Employee(3, "Sita", 90000, "IT"));
		employees.add(new Employee(4, "Aryan", 30000, "HR"));
		employees.add(new Employee(5, "Megha", 70000, "IT"));

		// Static method call
		EmployeeFilter.commonMessage();

		// Filter IT employees
		EmployeeFilter itFilter = e -> e.department.equalsIgnoreCase("IT");

		// Filter salary > 60000
		EmployeeFilter salaryFilter = e -> e.salary > 60000;

		// Filter name starts with 'L'
		EmployeeFilter nameFilter = e -> e.name.startsWith("L");

		System.out.println("\n--- IT Employees ---");
		EmployeeService.filter(employees, itFilter).forEach(System.out::println);

		System.out.println("\n--- Salary > 60000 ---");
		EmployeeService.filter(employees, salaryFilter).forEach(System.out::println);

		System.out.println("\n--- Name starts with L ---");
		EmployeeService.filter(employees, nameFilter).forEach(System.out::println);

		// Default method call
		itFilter.info();
	}
}
