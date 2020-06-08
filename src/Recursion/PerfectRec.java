package Recursion;

import java.util.Scanner;

public class PerfectRec {

	static boolean isPerfect(int n, int i, int sum){
		if(i>n/2)
			return sum==n;
		if(n%i==0)
			sum= sum+i;
		return isPerfect(n, i+1, sum);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		boolean res = isPerfect(n, 1, 0);
		if(res == true)
			System.out.println(n+" is a perfect Number");
		else
			System.out.println(n+" is not a perfect number");
		in.close();
	}

}
