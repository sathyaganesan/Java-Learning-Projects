package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
			tm.put(10, "Kavin");
			tm.put(15, "Bavin");
			tm.put(21, "Tuvin");
		System.out.println("Tree Map" + tm);
		
		TreeMap tree2 = new TreeMap();
		tree2.putAll(tm);
		System.out.println("Tree Map 2 "+ tree2);
		
		System.out.println("First Key: " + tree2.firstKey());
		System.out.println("Last Key: " + tree2.lastKey());
		System.out.println("First Entry: " + tree2.firstEntry());
		System.out.println("Last Entry: " + tree2.lastEntry());
	}
}
