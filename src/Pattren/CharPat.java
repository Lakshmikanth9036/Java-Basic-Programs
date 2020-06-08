package Pattren;

import java.util.Scanner;

public class CharPat {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	       int n=in.nextInt();
	       
	       for(int i=1;i<n;i++){
	    	 for(int j=1;j<=i;j++){
	    		 System.out.print((char)(j+96)+" ");
	    	 }
	    	  
	    	  System.out.println();
	       }
	}

}
