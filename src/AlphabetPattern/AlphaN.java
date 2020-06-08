package AlphabetPattern;

import java.util.Scanner;

public class AlphaN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(j==1 || i==j || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
