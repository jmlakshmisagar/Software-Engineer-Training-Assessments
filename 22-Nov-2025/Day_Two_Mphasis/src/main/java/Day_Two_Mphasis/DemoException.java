
package Day_Two_Mphasis;

import java.io.File;
import java.io.FileNotFoundException;

public class DemoException {

	public static void exrtactString(String string) {
		try {
			System.out.println(string.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String index error: " + e.getMessage());
		}
	}

	public static void CustomException(int a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {

			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		int a = 2, b = 0;
		String string = "sdaasd";

		try {
			System.out.println(string.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String index error: " + e.getMessage());
		}

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("Runtime error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("General error: " + e.getMessage());
		}

		System.out.println("Successful");
		
		File file = new File("demo.txt");
		if (!file.exists()) {
			throw new FileNotFoundException();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
