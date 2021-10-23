package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] charray =str.toCharArray();
		Set<Character> charset = new HashSet<Character>();
		Set<Character> dupcharset = new HashSet<Character>();
		for (int i = 0; i < charray.length; i++) {
			
			if(!charset.add(charray[i])) {
				dupcharset.add(charray[i]);
			}
		}
		for (Character character : dupcharset) {
			System.out.println(character);
			
		}
	}

}
