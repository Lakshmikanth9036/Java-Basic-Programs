package Recursion;

import java.util.Scanner;

public class Nto1 {

	static void print(int n){
		System.out.println(n);
		if(n>1)
			print(n-1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		print(n);
		in.close();
	}

}
