package Strings;

import java.util.Scanner;

public class VowelCounts {
	
	public static void main(String[] args) {
		StringOperations so = StringOperations.getInstance();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.next();
		System.out.println("Number of vowels in the string are: "+so.countVowels(s));
		in.close();
	}
}

