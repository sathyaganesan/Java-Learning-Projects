package sample_packeage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner MyObj = new Scanner(System.in);
		
		HashMap hm = new HashMap();
		
		hm.put(12, "Som");
		hm.put(13, "Ram");
		hm.put(67, "Tim");
		
//		It renders Object
		System.out.println("Hash Map" + hm);
		
		Set setDemo = hm.keySet();
		System.out.println("Set Demo" + setDemo);
		
		Collection valuesDemo = hm.values();
		System.out.println("Values Demo" + valuesDemo);
		
//		It renders Array
		Set entries = hm.entrySet();
		System.out.println("Entries" + entries);
	}
}
