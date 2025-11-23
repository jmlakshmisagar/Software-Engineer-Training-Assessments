package Functional_Example;

@FunctionalInterface
public interface EmployeeFilter {

	boolean check(Employee e);

	// Default method
	default void info() {
		System.out.println("This is an Employee Filter Functional Interface");
	}

	// Static method
	static void commonMessage() {
		System.out.println("Employee filtering started...");
	}
}
