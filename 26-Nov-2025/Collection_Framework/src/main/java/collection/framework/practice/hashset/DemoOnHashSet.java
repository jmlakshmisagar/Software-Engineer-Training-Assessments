package collection.framework.practice.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(56);
		hashSet.add(34);
		hashSet.add(23);
		hashSet.add(2);
		hashSet.add(536);
		System.out.println(hashSet);

		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		hashSet.forEach(System.out::println);

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(65);
		linkedHashSet.add(8);
		linkedHashSet.add(6365);
		linkedHashSet.add(2);
		linkedHashSet.add(99);
		linkedHashSet.add(92);
		linkedHashSet.add(97);
		
		System.out.println(linkedHashSet);

	}
}
