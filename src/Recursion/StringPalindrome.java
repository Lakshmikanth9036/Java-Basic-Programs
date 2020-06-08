package Recursion;

import java.util.Scanner;

public class StringPalindrome {
	
	static boolean isPalin(String s,String rev,int i){
		if(i<s.length())
			return isPalin(s, s.charAt(i)+rev, i+1);
		return s.equals(rev);	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.next();
		String rev="";
		boolean res = isPalin(s, rev, 0);
		if(res == true)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		in.close();
	}

}
