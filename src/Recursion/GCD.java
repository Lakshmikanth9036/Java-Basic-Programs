package Recursion;

import java.util.Scanner;

public class GCD {
	
	static int gcd(int m, int n){
		if(n>m)
			return gcd(n, m);
		if(m%n==0)
			return n;
		return gcd(n,m%n);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of m and n: ");
		int m = in.nextInt();
		int n = in.nextInt();
		int gcd = gcd(m, n);
		System.out.println("GCD of m and n is: "+gcd);
		in.close();
	}

}
