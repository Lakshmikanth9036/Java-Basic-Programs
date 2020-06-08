package Recursion;

import java.util.Scanner;

public class OneToN {
	
	static void display(int n){
		if(n>1)
			display(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		display(n);
		in.close();
	}

}
