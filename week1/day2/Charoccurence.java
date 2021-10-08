package week1.day2;

public class Charoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String str =" Welcome to Testleaf";
		char[] charArray = str.toCharArray();
		for (int i=0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				count ++;
			}
			
		}
		System.out.println("Occurence: "+count);
	}

}
