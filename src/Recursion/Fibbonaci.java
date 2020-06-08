package Recursion;

import java.util.Scanner;

public class Fibbonaci {
	
	static int fib(int n){
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		System.out.println(fib(n));
		in.close();
	}

}
