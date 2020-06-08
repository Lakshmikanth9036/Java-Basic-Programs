package Pattren;

import java.util.Scanner;

public class RevNumberPattern1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		for(int i=n;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
