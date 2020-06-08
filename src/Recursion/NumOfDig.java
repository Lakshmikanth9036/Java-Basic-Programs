package Recursion;

import java.util.Scanner;

public class NumOfDig {

	static int noOfDig(int n/*, int i*/){
		/*if(n==0 && i==0)
			return 1;
		if(n==0)
			return i;
		return noOfDig(n/10, i+1);*/
		if(n<10 && n>-10)
			return 1;
		return 1+noOfDig(n/10);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		System.out.println("Number of digits in the given number is: "+noOfDig(n/*, 0*/));
		in.close();
	}

}
