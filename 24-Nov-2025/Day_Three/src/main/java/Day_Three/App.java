package Day_Three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class App {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		Employee employee4 = new Employee(1, "zgdg", "ceo", 10.000);
		Employee employee1 = new Employee(4, "csadsa", "ceo", 2000.00);
		Employee employee2 = new Employee(88, "tdasdar", "ceo", 3000.00);
		Employee employee3 = new Employee(6, "bfdb", "ceo", 500.00);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		System.out.println("Functional Interface is starting ...........");
		System.out.println();
//
//		EmployeeInterface sortBySalary = list -> list.sort(Comparator.comparingDouble(Employee::getSalary));
//
//		sortBySalary.sort(employees);
//
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
//
//		Employee[] empl2 = { employee1, employee2, employee3, employee4 };
//
//		EmployeeInterface sortBySalary = arr -> Arrays.sort(arr, Comparator.comparingDouble(Employee::getSalary));
//
//		sortBySalary.sort(empl2);
//
//		sortBySalary.sort(empl2);
//
//		for (Employee employee : empl2) {
//			System.out.println(employee);
//		}
//
//		Employee[] empl2 = { employee1, employee2, employee3, employee4 };
// 
//		EmployeeInterface sortBySalary = arr -> Arrays.sort(arr, Comparator.comparing(Employee::getId));
//
//		sortBySalary.sort(empl2);
//
//		for (Employee employee : empl2) {
//			System.out.println(employee);
//		}
//
//		Supplier<Integer> generateRandomNumber = () -> {
//			return (int) Math.round(Math.random() * 10000);
//		};
//		

//		System.out.println(generateRandomNumber.get());
		
		int a = 2, b = 4;

		Supplier<Integer> maxSupplier = () -> {
			return a > b ? a : b;
		};

		System.out.println(maxSupplier.get());

	}
}
