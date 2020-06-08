package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringOperations so = StringOperations.getInstance();
		System.out.println("Enter the string: ");
		String s = in.next();
		boolean res = so.palin(s);
		if(res)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		in.close();
	}

}
