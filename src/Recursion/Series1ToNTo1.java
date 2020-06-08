package Recursion;

import java.util.Scanner;

public class Series1ToNTo1 {
	
	static void oneToNToOne(int n, int i){
		System.out.print(i+" ");
		if(n>1)
			oneToNToOne(n-1, i+1);
		if(n>1)
			System.out.print(i+" ");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		oneToNToOne(n, 1);
		in.close();
	}

}
