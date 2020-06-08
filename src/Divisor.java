import java.util.Scanner;

public class Divisor {
	public static void main( String args[] ) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		int divisor=1;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				divisor++;
		}
		System.out.println("Number of divisor of: "+n+" is "+divisor);
	}
}
