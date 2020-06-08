package Pattren;

import java.util.Scanner;

public class RevPrimNum121 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		int st=2*n-1;
		for(int i=1; i<=n ;i++){
			int k=1;
			for(int j=1; j<=i-1; j++){
				System.out.print("  ");
			}
			
			for(int j=1; j<=(n*2)-((i*2)-1); j++){
				System.out.print(k+" ");
				if(j<=n-i)
					k++;
				else
					k--;
			}
			System.out.println();
		} 
	}

}
