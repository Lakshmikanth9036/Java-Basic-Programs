package Pattren;

import java.util.Scanner;

public class NumberStarPat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			int k=1;
			for(int j=1;j<=n;j++){
				if(j%2==1){
					System.out.print(k);
					k++;
				}
				else{
					System.out.print(" * ");
				}
			}
			System.out.println();
	}
	}
}
