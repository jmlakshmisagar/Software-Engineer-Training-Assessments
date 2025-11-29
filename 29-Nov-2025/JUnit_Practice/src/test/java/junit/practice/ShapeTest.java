package junit.practice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ShapeTest {
	
	@ParameterizedTest
	@ValueSource(classes = { Circle.class, Triangle.class }) 
	public void drawTest(Class<?> clazz) throws Exception {
		Object obj = clazz.getDeclaredConstructor().newInstance();

		assertTrue(obj instanceof Shape, "Object should be a Shape");

		Shape shape = (Shape) obj;
		System.out.println("Shape type: " + shape.type());
	}
}
