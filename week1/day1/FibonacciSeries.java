package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int num3;
		int range = 8;
		System.out.print("output: "+num1+", "+num2+", ");
		for(int i= 2; i < range; i++) {
			num3 =num1+num2;
			System.out.print(num3+", ");
			num1=num2;
			num2=num3;
		}

	}

}
