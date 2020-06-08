package Strings;

import java.util.Scanner;

public class Counts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		int vc=0,cc=0, uc=0, lc=0, dc=0, spc=0;
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z'){
				uc++;
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
					vc++;
				else
					cc++;
			}
			else if(ch>='a' && ch<='z'){
				lc++;
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0' && ch<='9')
				dc++;
			else
				spc++;
		}
		
		
		System.out.println("Number of vowels in string: "+vc);
		System.out.println("Number of consonats in string: "+cc);
		System.out.println("Number of upper-case letters in string: "+uc);
		System.out.println("Number of lower-case letters in string: "+lc);
		System.out.println("Number of digits in string: "+dc);
		System.out.println("Number of special in string: "+spc);
		in.close();
	}

}
