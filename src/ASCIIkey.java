import java.util.Scanner;

public class ASCIIkey {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.next();
		for(int i=0;i<str.length();i++){
			char chr=str.charAt(i);
			int n=chr;
			System.out.println("The ASCII value of "+chr+" is "+n);
		}
	}
}
