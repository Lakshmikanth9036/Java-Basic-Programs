package Strings;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringOperations so = StringOperations.getInstance();
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		String con = so.converter(s);
		System.out.println("Coverted string is: "+con);
		in.close();
	}

}
