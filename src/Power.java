

import java.util.Scanner;

public class Power {
	static int pow(int n,int p){
		int pow=1;
		while(p>0){
			pow=pow*n;
			p--;
		}
		return pow;
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		int p=in.nextInt();
		System.out.println(pow(n,p));
	}

}
