package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1= "I am a software tester";
		char[] charArray = Str1.toCharArray();
		for (int i=0; i < charArray.length; i++) {
			if (i%2 != 0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
			
		}
		for (int i=0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}

	}

}
