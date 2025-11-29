package junit.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void sayHelloTest() {
		String expected = "Hello";
		String actualValue = new App().sayHello();
		assertEquals(expected, actualValue);
	}
}
