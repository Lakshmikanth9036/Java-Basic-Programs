package DS;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		String rs = "";
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(s.indexOf(ch) == s.lastIndexOf(ch))
				rs = rs+ch;
		}
		System.out.println("Unique character from the strings are: "+rs);
		in.close();
	}
}
