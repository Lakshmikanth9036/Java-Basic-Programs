package Recursion;

import java.util.Scanner;

public class SearchElementInArr {
	
	static int search(int[] a, int ele, int i){
		if(i>=a.length)
			return -1;
		if(ele == a[i])
			return i;
		return search(a, ele, i+1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		in.close();
	}

}
