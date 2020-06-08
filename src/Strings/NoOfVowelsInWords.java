package Strings;

import java.util.Scanner;

public class NoOfVowelsInWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringOperations so = StringOperations.getInstance();
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		so.noOfVowelsInWords(s);
		in.close();
	}

}
