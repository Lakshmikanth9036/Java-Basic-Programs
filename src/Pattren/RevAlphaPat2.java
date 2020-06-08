package Pattren;

import java.util.Scanner;

public class RevAlphaPat2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		for(int i=n;i>0;i--){
			for(int j=n-i;j<n;j++){
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
	}

}
