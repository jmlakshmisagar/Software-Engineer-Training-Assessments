
package collection.framework.practice.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class DemoOnLinkedList {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 5, 4, 7, 9, 9, 5, 46, 5, 8, 7, 54, 84, 6, 465, 489, 45, 588 };

		LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(array));

		System.out.println(integers);
//
//		Iterator<Integer> iterator = integers.descendingIterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		} 

		integers.poll();
		
		System.out.println(integers.offer(98265));
		
		
//		Iterator<Integer> iterator2 = integers.descendingIterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator2.next());
//		}
		System.out.println(integers);

	}
}
