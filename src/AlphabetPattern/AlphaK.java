package AlphabetPattern;

import java.util.Scanner;

public class AlphaK {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		int k = n/2+2;
		int x = n/2;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=k; j++){
				if(j==1 || i==j+x-1 && i>n/2 || i == (n-j)-(k/2-1) && i<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
