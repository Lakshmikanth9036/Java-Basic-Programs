package Recursion;

import java.util.Scanner;

public class ReverseNum {

	static int revNum(int n, int rev){
		if(n==0)
			return rev;
		return revNum(n/10, rev*10+n%10);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		System.out.println("Reverse of given number is: "+revNum(n, 0));
		in.close();
	}

}
