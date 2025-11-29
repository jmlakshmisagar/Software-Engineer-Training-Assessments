package memory.management.practice;

import java.util.ArrayList;
import java.util.List;

public class UnlimitedClass {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Object Creating");
			MyUnlimitedClass.items.add(new int[500000000]);
		}
	}
}

class MyUnlimitedClass{
	static List<int[]> items = new ArrayList<int[]>();
}