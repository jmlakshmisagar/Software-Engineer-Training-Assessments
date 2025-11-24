package Day_Three;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {
//		int n = 5;
//		Consumer<Integer> consumer = (num) -> {
//			System.out.println(num * num);
//		};
//
//		consumer.accept(n);

//		Integer[] arr = { 1, 2, 2, 5, 2, 254, 5, 498, 5, 65, 4, 64, 84, 65, 46, 46, 46, 46 };
//
//		Consumer<Integer[]> consumerArr = (array) -> {
//			Arrays.sort(array);
//			System.out.println(Arrays.toString(array));
//		};

//		consumerArr.accept(arr);

		Employee employee4 = new Employee(1, "zgdg", "ceo", 10.000);
		Employee employee1 = new Employee(4, "csadsa", "ceo", 2000.00);
		Employee employee2 = new Employee(88, "tdasdar", "ceo", 3000.00);
		Employee employee3 = new Employee(6, "bfdb", "ceo", 500.00);

		Employee[] empl2 = { employee1, employee2, employee3, employee4 };

		Consumer<Employee[]> printConsuer = (emp) -> {
			for (Employee employee : emp)
				System.out.println(employee );
		};

		printConsuer.accept(empl2);
		
	}

}
