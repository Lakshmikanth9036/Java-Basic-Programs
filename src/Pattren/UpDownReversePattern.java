package Pattren;

import java.util.Scanner;

public class UpDownReversePattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
				}
			for(int j=n-i;j!=0;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
