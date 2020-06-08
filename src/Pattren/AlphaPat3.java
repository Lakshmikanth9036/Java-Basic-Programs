package Pattren;

import java.util.Scanner;

public class AlphaPat3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			int k=i;
			for(int j=1;j<=i;j++){
				System.out.print((char)(k+64)+" ");
				k=k-1;
			}
			System.out.println();
		}
	}

}
