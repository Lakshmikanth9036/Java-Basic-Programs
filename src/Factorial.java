import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		 int n=in.nextInt();
		 long fact=1;
		 int i=2;
		 while(i<=n){
			 fact=fact*i;
			 i++;
		 }
		 System.out.println("Factorial of "+n+" is "+fact);
	}
}
