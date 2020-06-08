package Recursion;

import java.util.Scanner;

public class NoOfCharInStringTimes {
	static void print(String s, int n){
		if(n>s.length())
			return;
		System.out.println(s);
		print(s,n+1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String  s = in.next();
		print(s,1);
		in.close();
	}
}
