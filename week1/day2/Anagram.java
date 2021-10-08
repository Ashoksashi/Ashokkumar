package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length() == text2.length()) {
			char str1[]= text1.toCharArray();
			char str2[]=text2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			if (Arrays.equals(str1, str2)) {
				System.out.println("Both Texts are same.So, texts are Anagram");
			}else {
				System.out.println("Both Texts are different.So, Texts cannot be Anagram");
			}
		}else {
			System.out.println("Both Texts are of different length. So Texts cannot be Anagram");
		}

	}

}
