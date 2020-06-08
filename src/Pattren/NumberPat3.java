package Pattren;

import java.util.Scanner;

public class NumberPat3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			int k=i;
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k=k+n-j;
			}
			System.out.println();
		}
	}

}
