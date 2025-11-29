package junit.practice;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public boolean isEven(int a) {
		return a % 2 == 0;
	}

	public String checkText(String test) {
		return test;
	}

	int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	int brr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

	public int[] checkArrayTest() {
		return brr;
	}

	public void beforeEveryTest() {
		System.out.println("Testing of api started");
	}

}
