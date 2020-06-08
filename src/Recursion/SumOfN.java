package Recursion;

import java.util.Scanner;

public class SumOfN {
	
	static int sumOfN(int n){
		if(n==1)
			return 1;
		return n+sumOfN(n-1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		System.out.println(sumOfN(n));
		in.close();
	}

}
