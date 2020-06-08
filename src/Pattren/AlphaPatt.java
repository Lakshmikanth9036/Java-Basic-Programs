package Pattren;

import java.util.Scanner;

public class AlphaPatt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++,k++){
				System.out.print((char)(k+64)+" ");
			}
			System.out.println();
		}
	}

}
