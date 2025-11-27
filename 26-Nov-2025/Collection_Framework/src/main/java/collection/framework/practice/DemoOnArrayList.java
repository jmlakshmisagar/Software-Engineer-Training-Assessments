package collection.framework.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		arrayList.add(56);
		arrayList.add("Mphasis");
		arrayList.add(true);
		arrayList.add(8654.324);

		arrayList.add(56);
		arrayList.add("Mphasis");
		arrayList.add(true);
		arrayList.add(8654.324);

//		System.out.println(arrayList);
//		System.out.println(arrayList.get(5));

		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("lx");
		stringList.add("rv");
		stringList.add("rvce");
		stringList.add("rvce mca");

		Iterator<String> iterator = stringList.iterator();
		ListIterator<String> listIterator = stringList.listIterator();

//		while (listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		System.out.println();
//
//		while (listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}

//		stringList.forEach(name -> System.out.println(name));

		stringList.forEach(System.out::println);
		stringList.remove(3);
		stringList.forEach(System.out::println);

		ArrayList<Number> list1 = new ArrayList<Number>();
		ArrayList<Number> list2 = new ArrayList<Number>();

		Integer[] arr1 = { 5, 2, 1, 3, 4, 6, 8, 7, 9, 2, 8 };
		Integer[] arr2 = { 1, 5, 7, 9, 5, 64, 8, 8 };

		List<Integer> integers1 = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> integers2 = Arrays.asList(arr2);

		System.out.println(integers1);

		integers1.retainAll(integers2);

		System.out.println(integers1);

		integers1.sort((a, b) -> a > b ? 1 : -1);

		System.out.println(integers1);
		
//---------------------------------------------
		System.out.println(integers2);

		Collections.sort(integers2);
		
		System.out.println(integers2);

	}
}
