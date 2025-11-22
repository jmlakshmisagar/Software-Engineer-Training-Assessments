package Day_Two_Mphasis;

import java.util.Arrays;

public class NamePrinterClass {

	public static void main(String[] args) {

//		NamePrinter namePrinter = (name) -> {
//			System.out.println(new StringBuffer(name).reverse().toString());
//		};
//		
//
//		NamePrinter namePrinter = (i) -> System.out.println(i % 2 == 0 ? "Even" : "Odd");
//
//		namePrinter.stringReverse(12);
//
//		NamePrinter namePrinter = (arr) -> {
//			for (int i : arr)
//				System.out.print(i * i + " ");
//		};
//
//		int arrr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//		namePrinter.squareNumber(arrr);

		NamePrinter namePrinter = (strings) -> {
//			Arrays.sort(strings);
//			System.out.println(Arrays.toString(strings));

			int arr[] = new int[strings.length];
			int i=0;
			for(String s : strings) {
				arr[i] = s.length();
				i++;
			}
			
			System.out.println(Arrays.toString(arr));

		};

		String[] names = { "sdfg", "Sdg", "sdfgsdfg", "dfgsjna" };

		namePrinter.sortStrings(names);

	}

}
