package sample_packeage;

import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = new int[4];
		ar[0]= 5;
		ar[1] = 10;
		
		TreeSet <Integer>ts = new TreeSet<Integer>();
		
		ts.add(15);
		ts.add(17);
		ts.add(20);
		
		System.out.println(ts);
	}

}
