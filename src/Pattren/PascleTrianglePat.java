package Pattren;

import java.util.Scanner;

public class PascleTrianglePat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the vlaue of n: ");
		int n = in.nextInt();
		
		for(int i=0 ;i<n; i++){
			int k=1;
			for(int j=0; j<n-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++){
				System.out.print(k+" ");
				k = k*(i-j)/(j+1);//formula
			}
			System.out.println();
		}
		in.close();
	}

}
