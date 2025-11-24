package Day_Three;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnObjectReference {

	public static void main(String[] args) {
		String myname = "Mphasis Ltd";
		Supplier<Integer> sayMyName = myname::length;
		System.out.println(sayMyName.get());

		NumberUtilForMR forMR = new NumberUtilForMR();
		Predicate<Integer> isEvenByMR = forMR::isEven;

		System.out.println(isEvenByMR.test(5));
	}

}

class NumberUtilForMR {
	public boolean isEven(int num) {
		return num % 2 == 0;
	};
}

