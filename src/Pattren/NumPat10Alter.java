package Pattren;

import java.util.Scanner;

public class NumPat10Alter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=1;j<=n;j++){
				System.out.print((j+i)%2+" ");
			}
			System.out.println();
		}
	}

}
