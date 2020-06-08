package Pattren;

import java.util.Scanner;

public class DimondAlphaPat2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		int sp=n/2,st=1;
		
		for(int i=1; i<=n; i++){
			int k=st/2+1;
			for(int j=1; j<=sp; j++){
				System.out.print("  ");
			}
			
			for(int j=1; j<=st; j++){
				System.out.print((char)(k+96)+" ");
				if(j<=st/2)
					k--;
				else
					k++;
			}
			if(i<=n/2){
				sp--;
				st=st+2;
			}
			else{
				sp++;
				st=st-2;
			}
			System.out.println();
		}
	}

}
