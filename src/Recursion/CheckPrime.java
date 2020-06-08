package Recursion;

import java.util.Scanner;

public class CheckPrime {
	
	static boolean isPrime(int n, int i){
		if(i>=n/2)
			return true;
		if(n%i == 0)
			return false;
		return isPrime(n, i+1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		boolean res = isPrime(n, 2);
		if(res == true)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		in.close();
	}

}
