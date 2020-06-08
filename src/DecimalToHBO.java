import java.util.Scanner;

public class DecimalToHBO {
	
	static int decimalTobinary(int n){
		String binary="";
		do{
			int r=n%2;
			binary=r+binary;
			n=n/2;
		}while(n!=0);
		int bin=Integer.parseInt(String.valueOf(binary));
		return bin;
	}
	
	static int decimalToOctal(int n){
		String octal="";
		do{
			int r=n%8;
			octal=r+octal;
			n=n/8;
		}while(n!=0);
		int oct=Integer.parseInt(String.valueOf(octal));
		return oct;
	}
	
	static String decimalToHexadecimal(int n){
		String hexa="";
		do{
			int r=n%16;
			if(r<10)
				hexa=r+hexa;
			else
				hexa=(char)(r+55)+hexa;
			n=n/16;
		}while(n!=0);
		return hexa;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the decimal value");
		int n=in.nextInt();
		int binary=decimalTobinary(n);
		System.out.println("Binary value of the given decimal number is: "+binary);
//		int octal=decimalToOctal(n);
//		System.out.println("Octal value of the given decimal number is: "+octal);
//		String hexa=decimalToHexadecimal(n);
//		System.out.println("Hexadecimal value of the given decimal number is: "+hexa);
	}

}
