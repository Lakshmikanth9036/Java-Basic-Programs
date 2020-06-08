package Recursion;

import java.util.Scanner;

public class StringPalin2 {

	static boolean isPalin(String s,int i,int last){
		if(s.charAt(i)!=s.charAt(last))	
			return false;
		if(i<last)
			return isPalin(s, i+1, last-1);
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.next();
		boolean res = isPalin(s, 0, s.length()-1);
		if(res == true)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		in.close();
	}

}
