package Strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		StringOperations so = StringOperations.getInstance();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = in.nextLine();
		System.out.println("Enter the string:");
		String s2 = in.nextLine();
//		boolean res = so.isAnagram(s1,s2);
//		boolean res2 = so.isAnagram2(s1,s2);
//		if(res)
//			System.out.println("String is a Aangram");
//		else
//			System.out.println("String is not a Aangram");
//		if(res2)
//			System.out.println("String is a Aangram");
//		else
//			System.out.println("String is not a Aangram");
		
		int c = so.makeAnagram(s1, s2);
		System.out.println(c);
		in.close();
	}

}
