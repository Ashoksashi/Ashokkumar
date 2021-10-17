package week3.day1;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am Learning Selenium";
		String str2 = "I am learning selenium";
		
		//Comparsion using == operator
		if (str1 == str2) {
			System.out.println("Strings are matched");
		}else {
			System.out.println("Strings are not matched");
		}
		
		//Comparsion using equals
		if (str1.equals(str2)) {
			System.out.println("Strings are matched");
		}else {
			System.out.println("Strings are not matched");
		}
		
		//Comparsion using equalsIgnoreCase
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Strings are matched");
		}else {
			System.out.println("Strings are not matched");
		}
	}

}
