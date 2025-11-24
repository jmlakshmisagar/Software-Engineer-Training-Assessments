package Day_Three;

import java.util.function.Predicate;

public class ValidatePassword {
	public static class ValidatorPassword {
		public static boolean passWordValidator(String password) {
			return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
		}

		public static boolean bonusChecker(Employee employee) {
			return employee.getBonus() > 0.0;
		}
		
		public static boolean startsWithA(Employee employee) {
			return employee.getName().matches("^[Aa].*");
		}
	}

	public static void main(String[] args) {
		Predicate<String> passwordChecker = ValidatorPassword::passWordValidator;

		System.out.println(passwordChecker.test("Test@123"));

		Employee employee4 = new Employee(1, "Agdg", "ceo", 10.00, 1000.00);
		Employee employee1 = new Employee(4, "csadsa", "ceo", 2000.00, 500.00);  
		Employee employee2 = new Employee(88, "tdasdar", "ceo", 3000.00);
		Employee employee3 = new Employee(6, "bfdb", "ceo", 500.00, 200.00);

		Employee[] empl2 = { employee1, employee2, employee3, employee4 };

		for (Employee employee : empl2) {
			System.out.println(ValidatorPassword.bonusChecker(employee) ? employee : "");
		}
		
		for (Employee employee : empl2) {
			System.out.println(ValidatorPassword.startsWithA(employee) ? employee : "");
		}

	}

}
