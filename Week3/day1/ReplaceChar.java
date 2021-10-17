package week3.day1;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		String replace = sentence.replaceFirst("8", "11");
		replace = replace + "#";
		System.out.println(replace);
		
		System.out.println(replace.substring(5, 15));
	}

}
