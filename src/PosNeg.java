import java.util.Scanner;
public class PosNeg {
	public static void main(String[] args){
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		if(n>0)
			System.out.println(n+" is a positive number");
		else if(n<0)
			System.out.println(n+" is a negative number");
		else
			System.out.println(n+" is neither positive nor negative");
	}
}
