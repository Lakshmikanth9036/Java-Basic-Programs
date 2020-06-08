package Strings;

import java.util.Scanner;

public class SumOfDig {
	
	public static void main(String[] args) {
		
		StringOperations so = StringOperations.getInstance();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.next();
		System.out.println("Sum of digits in the string are: "+so.sumOfDigits2(s));
		in.close();
	}

}
