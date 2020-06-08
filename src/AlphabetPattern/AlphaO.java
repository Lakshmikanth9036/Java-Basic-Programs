package AlphabetPattern;

import java.util.Scanner;

public class AlphaO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==1 && j==1 || i==1 && j==n || i==n && j==1 || i==n && j==n)
					System.out.print("  ");
				else if(i==1||j==1||i==n||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}
