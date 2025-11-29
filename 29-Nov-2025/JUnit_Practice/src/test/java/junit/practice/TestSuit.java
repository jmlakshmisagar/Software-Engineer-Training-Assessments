package junit.practice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculatorTest.class, ShapeTest.class, MathUtilTest.class })


public class TestSuit {
	

	public void isEvenTest() {
		assertTrue(new MathUtil().isEven(8));
	}
}
