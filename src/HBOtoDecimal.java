import java.util.Scanner;

public class HBOtoDecimal {
	static int binaryToDecimal(int n){
		int decimal=0,p=1;
		do{
		int	r=n%10;
		decimal=decimal+r*p;
		p=p*2;
		n=n/10;
		}while (n!=0);
		return decimal;
	}
	
	static int octalToDecimal(int n){
		int decimal=0,p=1;
		do{
			int r=n%10;
			decimal=decimal+r*p;
			p=p*8;
			n=n/10;
		}while(n!=0);
		return decimal;
	}
	
	static int hexaToDecimal(String s){
		s=s.toUpperCase();
		int dec=0,p=1;
		for(int i=s.length()-1;i>=0;i--){
			char c=s.charAt(i);
			if(c>=48 && c<=57){
				dec=dec+((c-48)*p);
			}
			else{
				dec=dec+(c-55)*p;
			}
			p=p*16;
		}
		return dec;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*System.out.println("Enter the binary number");
		int binary=in.nextInt();
		int decimal1=binaryToDecimal(binary);
		System.out.println("Decimal convertion of the given binary number is: "+decimal1);
	    System.out.println("Enter the octal number");
		int octal=in.nextInt();
		int decimal2=octalToDecimal(octal);
		System.out.println("Decimal convertion of the given octal number is: "+decimal2);*/
		System.out.println("Enter the hexadecimal number");
		String hexa=in.next();
		int decimal3=hexaToDecimal(hexa);
		System.out.println(decimal3);
		
	}

}
