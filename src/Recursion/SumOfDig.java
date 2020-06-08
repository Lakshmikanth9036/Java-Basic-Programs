package Recursion;

import java.util.Scanner;

public class SumOfDig {
	
	static int sumOfDig(int n/*,int sum*/){
		/*if(n==0)
			return sum;
		return sumOfDig(n/10, sum+n%10);*/
		if(n<10 && n>-10)
			return 1;
		return n%10+sumOfDig(n/10);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		System.out.println("Sum of digits of the given number is: "+sumOfDig(n/*, 0*/));
		in.close();
	}

}
