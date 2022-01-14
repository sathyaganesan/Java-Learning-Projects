package collections;

import java.util.HashMap;

public class StringMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ammaappa";
		HashMap <Character, Integer> charCount = new HashMap <Character, Integer>();
		char [] ch = s.toCharArray();
		for(char c : ch) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			} else {
				charCount.put(c, 1);
			}
		}
		System.out.print(charCount);
	}
}
