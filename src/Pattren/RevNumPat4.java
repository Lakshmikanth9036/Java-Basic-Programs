package Pattren;

import java.util.Scanner;

public class RevNumPat4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = in.nextInt();
		for(int i=1; i<=n ;i++){
			int k=i;
			for(int j=1; j<=n-i; j++){
				System.out.print("  ");
			}
			
			for(int j=1; j<=i*2-1; j++){
				System.out.print(k+" ");
				if(j<i)
					k--;
				else
					k++;
			}
			System.out.println();
		} 
	}

}
