package week1.day2;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatorFunction obj = new calculatorFunction();
        System.out.println("Addition of number :"+obj.add(3,6,2));
        System.out.println("Subtraction of number :"+obj.sub(3,6));
        System.out.println("Multiplication of number :"+obj.mul(4,5));
        System.out.println("Division of number :"+obj.div(5,7));

	}

}
