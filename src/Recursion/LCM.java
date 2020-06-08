package Recursion;

import java.util.Scanner;

public class LCM {
	
	static int  lcm(int m, int n, int pro){
		if(m>n)
			return lcm(n,m,m);
		if(pro%m == 0)
			return pro;
		return lcm(m, n, pro+n);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of m, n and product: ");
		int m = in.nextInt();
		int n = in.nextInt();
		int lcm = lcm(m, n, n );
		System.out.println("LCM of m and n is: "+lcm);
		in.close();
	}

}
