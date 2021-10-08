package week1.day2;

public class twosumproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {2, 11, 15, 7, 3, 5, 4};
		int length = num.length;
		for (int i=0; i < length; i++) {
			for (int j=i+1; j < length; j++) {
				if (num[i]+num[j] == 9) {
					System.out.println(num[i]);
					System.out.println(num[j]);
				}
			}
			
		}

	}

}
