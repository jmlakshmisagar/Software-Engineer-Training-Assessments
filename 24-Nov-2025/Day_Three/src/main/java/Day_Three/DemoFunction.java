package Day_Three;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> squareNumber = num -> num * num;
		int arr[] = { 1, 654, 6, 8513, 51, 2, 12, 15, 165, 486, 654, 984, 54, 984, 61, 321, 4, 6, 354, 98461, 165 };
		Arrays.sort(arr);
		for (Integer integer : arr)
			System.out.print(squareNumber.apply(integer) + " ");

		System.out.println();

		Function<String, String> makeUpperCase = name -> name.toUpperCase();

		Employee employee4 = new Employee(1, "zgdg", "ceo", 10.000);
		Employee employee1 = new Employee(4, "csadsa", "ceo", 2000.00);
		Employee employee2 = new Employee(88, "tdasdar", "ceo", 3000.00);
		Employee employee3 = new Employee(6, "bfdb", "ceo", 500.00);

		Employee[] empl2 = { employee1, employee2, employee3, employee4 };

		Predicate<Integer> checkSalary = num -> num > 1000;
		
		for (Employee employee : empl2)
			System.out.println(makeUpperCase.apply(employee.getName()));
		

		
	}
}
