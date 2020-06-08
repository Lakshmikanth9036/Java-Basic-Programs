package Recursion;

import java.util.Scanner;

public class FactorialOfN {
	
	static int fact(int n){
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		System.out.println(fact(n));
		in.close();
	}

}
