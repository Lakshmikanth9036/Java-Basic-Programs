package Recursion;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalin(int n, int rev, int temp){
		if(n==0)
			return rev==temp;
		return isPalin(n/10,rev*10+n%10,temp);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		boolean res = isPalin(n, 0, n);
		if(res == true)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
		in.close();
	}

}
