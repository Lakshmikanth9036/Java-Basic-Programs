import java.util.Scanner;

public class RangedPrime {
	static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main( String args[] ) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of m and n ");
		int m=in.nextInt();
		int n=in.nextInt();
		for(int i=m;i<=n;i++){
			boolean res=isPrime(i);
			if(res==true){
				System.out.println(i);
			}
		}
	}
}
