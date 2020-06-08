package Pattren;

import java.util.Scanner;

public class RevAlphaPatt1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}
