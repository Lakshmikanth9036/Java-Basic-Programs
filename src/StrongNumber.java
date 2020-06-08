import java.util.Scanner;

public class StrongNumber {//Sum of factorial of digits
	static boolean isStrong(int n){
		int sum=0,temp=n;
		while(n!=0){
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		return sum==temp;
	}
	static int fact(int r) {
		int fact=1;
		while(r>1){
			fact=fact*r;
			r--;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		boolean res=isStrong(n);
		if(res==true)
			System.out.println(n+" is a strong number");
		else 
			System.out.println(n+" is a not strong number");
	}

}
