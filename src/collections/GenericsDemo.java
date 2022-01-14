package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = new int[4];
		ar[0]= 5;
		ar[1] = 10;

//		There is no type safety in Collections
//		TreeSet won't allow the duplicate
		TreeSet <Integer>ts = new TreeSet<Integer>();
		ts.add(15);
		ts.add(20);
		ts.add(15);
		ts.add(17);
		System.out.println("Tree Set " +ts);
		
		ArrayList <String> al = new ArrayList <String>();
		al.add("Mina");
		al.add("Teena");
		al.add("Mani");
		System.out.println("Array List " + al);
	}

}
