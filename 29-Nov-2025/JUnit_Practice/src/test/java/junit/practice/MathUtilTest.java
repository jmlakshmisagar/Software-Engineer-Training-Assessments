package junit.practice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MathUtilTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	public void isEvenTest(int n) {
		assertTrue(MathUtil.isEven(8));
	}

	@ParameterizedTest
	@ValueSource(strings = { "sharan", "shamitha", "shobith" })
	
	
	public void startsWithTest(String s) {
		assertTrue(MathUtil.startsWith(s));
	}
}
