package Day_Three;

import java.util.function.Predicate;

public class DemoPredicate {
	public static void main(String[] args) {

		int n = 45;
		Predicate<Integer> isEven = (num) -> num % 2 == 0;

		System.out.println(isEven.test(12) ? "Even" : "False");

		Predicate<String> checkLength = string -> string.length() > 7;

		System.out.println(checkLength.test("Mphasis Ltd") ? "Greater" : "Lesser");

		Predicate<Employee> checkSalary = (emp) -> emp.getSalary() >= 1000;

		Employee employee4 = new Employee(1, "zgdg", "ceo", 10.000);
		Employee employee1 = new Employee(4, "csadsa", "ceo", 2000.00);
		Employee employee2 = new Employee(88, "tdasdar", "ceo", 3000.00);
		Employee employee3 = new Employee(6, "bfdb", "ceo", 500.00);

		Employee[] empl2 = { employee1, employee2, employee3, employee4 };

		for (Employee employee : empl2)
			System.out.println(checkSalary.test(employee) ? employee : "");

	}
}
