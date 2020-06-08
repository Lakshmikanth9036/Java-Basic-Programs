import java.util.Scanner;

public class Fibonacci {
	static int fib(int n)
	{
		int f1=0,f2=1,f3=0;
		while(n>2){
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return f3;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		System.out.println(fib(n));

	}

}
