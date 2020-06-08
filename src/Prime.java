import java.util.Scanner;

public class Prime {

	static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main( String args[] ) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		boolean res=isPrime(n);
		if(res==true)
			System.out.println(n+" is a prime number");
		else 
			System.out.println(n+" is a not prime number");
		}
}
