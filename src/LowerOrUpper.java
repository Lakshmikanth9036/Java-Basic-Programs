import java.util.Scanner;

public class LowerOrUpper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character");
		String chr=in.next();
		char c=chr.charAt(0);
		if(c>=65 && c<=90)
			System.out.println(c+" is in Uppercase");
		else if(c>=97 && c<=122)
			System.out.println(c+" is in Lower case");	
		else if(c>='0' && c<='9')
			System.out.println("Digits");
		else
			System.out.println("Special character");
	}

}
