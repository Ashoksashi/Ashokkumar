package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 153,total=0,num,tmp;
		num = input;                                                                                                                                                                                                                              
		while(num > 0) {
			tmp = num%10;
			//System.out.println(tmp);
			total = total+ tmp*tmp*tmp;
			num/=10;
			//System.out.println(num);
		}
		if (input == total) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an Armstrong number");
		}
		
	}

}
