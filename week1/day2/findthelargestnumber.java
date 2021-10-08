package week1.day2;

import java.util.Arrays;

public class findthelargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testarry= {100, 49, 398, 34, 1, 267};
		int length = testarry.length;
		System.out.println("display array");
		for (int i=0; i < length; i++) {
			System.out.println(testarry[i]);
		}
		System.out.println("display array after sorted");
		Arrays.sort(testarry);
		for (int i=0; i < length; i++) {
			System.out.println(testarry[i]);
		}
		System.out.println("Second largest in array");
		System.out.println(testarry[length-2]);
		System.out.println("largest in array");
		System.out.println(testarry[length-1]);
		System.out.println("least in array");
		System.out.println(testarry[0]);
		System.out.println("second least in array");
		System.out.println(testarry[1]);
	}

}
