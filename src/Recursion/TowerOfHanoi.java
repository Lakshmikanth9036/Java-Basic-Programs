package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	static void move(char src, char temp, char dst, int n){
		if(n==1){
			System.out.println(n+" disk moves from "+src+" to "+dst);
			return;
		}
		move(src, dst, temp, n-1);
		System.out.println(n+" disk moves from "+src+" to "+dst);
		move(temp, src, dst, n-1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of disks: ");
		int n = in.nextInt();
		move('S','T','D',n);
		in.close();
	}

}
