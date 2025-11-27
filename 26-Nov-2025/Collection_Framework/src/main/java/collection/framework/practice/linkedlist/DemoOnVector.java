package collection.framework.practice.linkedlist;

import java.util.Enumeration;
import java.util.Vector;

public class DemoOnVector {
	public static void main(String[] args) {
		Vector<Integer> integers = new Vector<Integer>();

		for (int i = 0; i <= 10; i++)
			integers.add(i);

		System.out.println(integers);

		System.out.println(integers.capacity());

		Enumeration<Integer> enumeration = integers.elements();
		while (enumeration.hasMoreElements()) {
			int num = enumeration.nextElement();
//			System.out.println(enumeration.nextElement());
		}
		
		
	}
}
