package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nf=5;
		int i=1;
		int fact = 1;
		while( i<= nf) {
			fact = fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
