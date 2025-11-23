package Functional_Example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	// Accepts Functional Interface as parameter
	public static List<Employee> filter(List<Employee> list, EmployeeFilter filter) {

		List<Employee> result = new ArrayList<>();

		for (Employee e : list) {
			if (filter.check(e)) {
				result.add(e);
			}
		}
		return result;
	}
}
