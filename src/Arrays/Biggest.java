package Arrays;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n = in.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the "+n+" elements");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		
		int biggest = a[0];
		System.out.println("Entered array element are: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			if(biggest<a[i])
				biggest=a[i];
		}
		System.out.println();
		System.out.println("Biggest element in the array: "+biggest);
		in.close();
	}

}
