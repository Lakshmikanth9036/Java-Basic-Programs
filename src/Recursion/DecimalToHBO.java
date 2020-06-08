package Recursion;

import java.util.Scanner;

public class DecimalToHBO {
	
	static String decToBin(int n,String s){
		if(n==0)
			return s;
		return decToBin(n/2, n%2+s);	
	}
	
	static String decToOct(int n,String s){
		if(n==0)
			return s;
		return decToOct(n/8, n%8+s);	
	}
	
	static String decToHexa(int n, String s){
		int r = n%16;
		if(n==0)
			return s;
		if(r<10)
			return decToHexa(n/16, r+s);
		else
			return decToHexa(n/16,(char)(r+55)+s);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the decimal value");
		int n=in.nextInt();
		String s = decToHexa(n, "");
		System.out.println("Decimal to binary convertion of "+n+" is "+s);
		in.close();
	}

}
