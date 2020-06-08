package DS;

import java.util.Scanner;

public class AdjecentOnOff {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of days: ");
		int n = in.nextInt();
		int[] a = new int[10];
		System.out.println("Enter the light status: ");
		for(int i=1; i<=8; i++){
			a[i] = in.nextInt();
		}

		while(n>0){
			int b[]  = new int[10];
			for(int i=1; i<=8; i++){
				if(a[i-1]==a[i+1])
					b[i]=0;
				else
					b[i]=1;
			}
			a=b;
			n--;
		}
		
		System.out.println("Ligit status after "+n+" days: ");
		for(int i=1; i<=8; i++){
			System.out.print(a[i]+" ");
		}
		in.close();
	}
}