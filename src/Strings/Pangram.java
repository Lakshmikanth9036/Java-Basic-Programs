package Strings;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		StringOperations so = StringOperations.getInstance();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = in.next();
		boolean res = so.isPangram(s);
		boolean res2 = so.isPangram2(s);
		if(res)
			System.out.println("String is a pangram");
		else
			System.out.println("String is not a pangram");
		if(res2)
			System.out.println("String is a pangram");
		else
			System.out.println("String is not a pangram");
		in.close();
	}

}
