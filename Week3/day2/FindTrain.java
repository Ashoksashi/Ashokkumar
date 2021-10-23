package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTrain {

	public static void main(String[] args) {
		
		List<String> trainame = Arrays.asList("Pearl City","Ananthapuri","Tiruchendur", "Sethu","Sethu");
		Collections.sort(trainame);
		System.out.println(trainame);
		int Size = trainame.size();
		trainame.add("Chennai Express");
		System.out.println(trainame.get(Size-1));
		
		System.out.println(trainame);
		trainame.remove("Sethu");
		System.out.println(trainame);
		System.out.println(trainame.get(0));
		

	}

}
