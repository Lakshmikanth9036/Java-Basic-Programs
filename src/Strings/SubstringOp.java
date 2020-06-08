package Strings;

import java.util.Scanner;

public class SubstringOp {

	public static void main(String[] args) {
		StringOperations so = StringOperations.getInstance();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = in.nextLine();
		System.out.println("Enter the substring ");
		String s2 = in.next();
		
		
		boolean res = so.isSubstr(s1, s2);
		if(res)
			System.out.println("Substring "+s2+" is present in the given string ");
		else
			System.out.println("Substring "+s2+" is not present in the given string ");
		
		
		System.out.println("Number of times this substring present in string " +so.countSubStr(s1, s2));
		
		
		boolean res1 = so.isWord(s1, s2);
		if(res1)
			System.out.println("Substring "+s2+" is a word in the given string ");
		else
			System.out.println("Substring "+s2+" is not word in the given string ");
		
		
		System.out.println("Number of times this substring present in string " +so.countWord(s1, s2));
		
		
		int index = so.indexOfSubStr(s1, s2);
		if(index >= 0)
			System.out.println("Substring is present at a index: "+index);
		else
			System.out.println("Substring is not present in the string");
		
		
		
		
		in.close();
	}

}
