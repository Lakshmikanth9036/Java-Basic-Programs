package Recursion;

import java.util.Scanner;

public class Biggest {
	
	static int biggest(int[] a, int biggest,int i){
		if(i>a.length-1)
			return biggest;
		if(biggest < a[i])
			biggest = a[i];
		return biggest(a, biggest, i+1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numberof elements: ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the "+n+" elements");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		
		int biggest = biggest(a, a[0], 0);
		System.out.println("Biggest element in the array is: "+biggest);
		in.close();
	}
}
