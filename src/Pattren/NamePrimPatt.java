package Pattren;

import java.util.Scanner;

public class NamePrimPatt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str=in.next();
		char chr[]=new char[str.length()];
		for(int i=0;i<str.length();i++){
			chr[i]=str.charAt(i);
		}
		int n=str.length();
		for(int i=0;i<n;i++){
			for(int j=(n-i);j!=0;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(chr[j]+" ");
			}
			System.out.println();

		}
	}
}
