package Pattren;

import java.util.Scanner;

public class NumPat10 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the value of n");
	       int n=in.nextInt();
	       for(int i=1;i<=n;i++){
	    	   for(int j=1;j<=i;j++){
	    		   System.out.print(j%2+" ");
	    	   }
	       System.out.println();
	    }

	}

}
