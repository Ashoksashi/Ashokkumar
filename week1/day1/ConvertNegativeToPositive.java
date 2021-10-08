package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=-40;
		if (number < 0) {
			number*= -1;
			System.out.println("The number is Negative and converted to positive and number is " + number);
		}else if(number > 0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is Neutral");
		}

	}

}
