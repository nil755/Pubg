package Stringprogramm;

import java.util.Arrays;

public class Highestnoinarray {
	
	
	
	public static void main(String[] args) {
		
		int num []= {11,12,85,125,45,500,250};
		
		Arrays.sort(num);
		
		for (int i=0; i<=num.length-1; i++) {
			System.out.println(num[i]);
		}
		System.out.println("Largest element is: "+num[num.length-1]);
		
		
	}

}
