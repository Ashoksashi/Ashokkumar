package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam",rev="";
		char chararr[]= str.toCharArray();
		for(int i= chararr.length-1; i>=0; i--) {
			rev=rev+chararr[i];
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is Not Palindrome");
		}

	}

}
