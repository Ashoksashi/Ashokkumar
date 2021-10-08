package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] var1 = test.split(" ");
		String var2 = "";
		for(int i=0; i < var1.length; i++) {
			if(i%2 == 1) {
				var2 = var2 + new StringBuilder(var1[i]).reverse().toString()+" ";
			}else {
				var2 = var2 + var1[i] + " ";
			}
		}
		System.out.println(var2);
	}

}
