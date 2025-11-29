
package junit.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void addTest() {
		int expected = 10;
		int actualValue = calc.add(5, 5);
		assertEquals(expected, actualValue, "Addition failed");
	}

	@Test
	public void subTest() {
		int expected = 0;
		int actualValue = calc.sub(5, 5);
		assertEquals(expected, actualValue, "Subtraction failed");
	}

	@Test
	public void mulTest() {
		int expected = 25;
		int actualValue = calc.mul(5, 5);
		assertEquals(expected, actualValue, "Multiplication failed");
	}

	@Test
	public void divTest() {
		int expected = 2;
		int actualValue = calc.div(10, 5);
		assertEquals(expected, actualValue, "Division failed");
	}

	@Test
	public void divByZeroTest() {
		assertThrows(ArithmeticException.class, () -> calc.div(10, 0),
				"Division by zero should throw ArithmeticException");
	}

	@Test
	public void modTest() {
		int expected = 1;
		int actualValue = calc.mod(10, 3);
		assertEquals(expected, actualValue, "Modulus failed");
	}

	@Test
	public void modByZeroTest() {
		assertThrows(ArithmeticException.class, () -> calc.mod(10, 0),
				"Modulus by zero should throw ArithmeticException");
	}

	@Test
	public void isEvenValue() {
		assertTrue(new Calculator().isEven(4), "For input 5 assert throw error");
	}

	public void chectTextTest() {
		String result = new Calculator().checkText("Hello");
		assertNotNull(result, "Expected non-null result for non-null input");
	}

	@Test
	public void checkArraysTest() {
		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		assertArrayEquals(arr, new Calculator().checkArrayTest());
	}

	@BeforeAll
	public static void beforeTest() {
		System.out.println("Testing of api started");
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("Testing of api completed");
	}
}
