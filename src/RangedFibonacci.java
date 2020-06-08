import java.util.Scanner;

public class RangedFibonacci {
	static void fibo(int m,int n){
		int f1=0,f2=1,f3=0;
		while(f1<=n){
			if(f1>=m)
				System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int m=in.nextInt();
		int n=in.nextInt();
		fibo(m,n);
		
	}

}
