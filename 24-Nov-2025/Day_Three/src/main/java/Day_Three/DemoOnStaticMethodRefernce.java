package Day_Three;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoOnStaticMethodRefernce {
	static class NumberUtil {
		public static int squareNum(int num) {
			return num * num;
		}

		public static double logNum(int num) {
			return Math.log(num);
		}

		public static boolean isEven(int num) {
			return num % 2 == 0;
		};
	}

	static class StringUtil {
		public static int findLength(String str) {
			return str.length();
		}

		public static void findLengthBySupplier(String string) {
			System.out.println(string.length());
		}
	}

	public static void main(String[] args) {
		Function<Integer, Integer> squareNumber = NumberUtil::squareNum;
		Function<Integer, Double> logNumberGen = NumberUtil::logNum;

		System.out.println(squareNumber.apply(6));
		System.out.println(logNumberGen.apply(5));

		Predicate<Integer> isEvenMR = NumberUtil::isEven;

		System.out.println(isEvenMR.test(5));

		Function<String, Integer> findLengthOfString = StringUtil::findLength;
		Consumer<String> findLengthOfStringSupplier = StringUtil::findLengthBySupplier;

		System.out.println(findLengthOfString.apply("Mphasis"));
		findLengthOfStringSupplier.accept("Mphasis");
	}
}
