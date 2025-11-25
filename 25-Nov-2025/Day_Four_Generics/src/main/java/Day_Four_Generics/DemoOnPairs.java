package Day_Four_Generics;

import java.util.Arrays;

public class DemoOnPairs {

	public static <T> void display(T data) {
		System.out.println("Data is : " + data);
	}

	public static <T extends Number, V extends Number> void add(T t1, V u1) {
		System.out.println("Addition is : " + t1 + u1);
		System.out.println(t1.intValue() + u1.intValue());
	}

	public static void main(String[] args) {
		Order<String> order = new Order<String>("Laptop");
		System.out.println(order);

		Item item1 = new Item(1, "wadD", 500);
		Item item2 = new Item(1, "wadD", 2000);
		Item item3 = new Item(1, "wadD", 7540);
		Item item4 = new Item(1, "wadD", 4527);

		Item item[] = { item1, item2, item3, item4 };

		Order<Item[]> orders = new Order<>(item);

		System.out.println(Arrays.toString(orders.getItems()));

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayPrinter<Integer> arrayPrinter = new ArrayPrinter<>(arr);
		System.out.println(arrayPrinter);

		display("Mphasis");
		display(true);
		display(55);
		display(arrayPrinter);

//		add("RVCE", "MCA");
		add(1, 3);
		
	}

}
