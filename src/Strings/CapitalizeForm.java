package Strings;

import java.util.Scanner;

public class CapitalizeForm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringOperations so = StringOperations.getInstance();
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		System.out.println(so.capitalizeForm(s));
		in.close();
	}

}
