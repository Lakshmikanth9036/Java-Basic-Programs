package Recursion;

import java.util.Scanner;

public class SumOfArrayEle {
	
	static int sumOfEle(int[] a,int sum, int i){
		if(i>a.length-1)
			return sum;
		return sumOfEle(a, sum+a[i], i+1);
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
		int sum = sumOfEle(a, 0, 0);
		System.out.println("Sum of array elements: "+sum);
		in.close();
	}

}
