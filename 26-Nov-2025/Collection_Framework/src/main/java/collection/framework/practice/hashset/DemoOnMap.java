package collection.framework.practice.hashset;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Mphasis");
		hashMap.put(2, "RVCE");
		hashMap.put(3, "MCA");
		hashMap.put(4, "2025");
		hashMap.put(1, "Wednesday");

		System.out.println(hashMap);
		System.out.println(hashMap.entrySet());

		HashMap<Integer, HashMap<Integer, String>> hashMap1 = new HashMap<>();

		HashMap<Integer, String> innerMap1 = new HashMap<>();
		innerMap1.put(1, "Mphasis");
		innerMap1.put(2, "RVCE");

		HashMap<Integer, String> innerMap2 = new HashMap<>();
		innerMap2.put(3, "MCA");
		innerMap2.put(4, "2025");

		hashMap1.put(100, innerMap1);
		hashMap1.put(200, innerMap2);

		System.out.println(hashMap1);

		Set<Integer> set = hashMap.keySet();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());	
		}

		Set<String> set1 = new HashSet<>(hashMap.values());
		Iterator<String> iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		Iterator<Entry<Integer, String>> iterator11 = hashMap.entrySet().iterator();
		System.out.println(iterator11);
		while (iterator11.hasNext()) {
			System.out.println(iterator11.next());
		}

//		Enumeration<Entry<Integer, String>> iterator111 =new Enumeration<Map.Entry<Integer,String>>(hashMap.entrySet().iterator());

		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(3, 6);
		treeMap.put(5, 6);
		treeMap.put(2, 6);
		treeMap.put(77, 6);
		treeMap.put(12, 6);
		treeMap.put(444, 6);

		System.out.println(treeMap);

		System.out.println(treeMap.higherKey(11));

		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(1, "mphasis");
		hashtable.put(2, "rvce");
		hashtable.put(8, "mca");
		hashtable.put(4, "2025");
		hashtable.put(9, "rvce mca 2025");

		System.out.println(hashtable);

		Enumeration<String> enumeration = hashtable.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

	}
}
