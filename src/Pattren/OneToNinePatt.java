package Pattren;

import java.util.Scanner;

public class OneToNinePatt {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 int k=1;
	 for(int i=1;i<=n;i++){
		 for(int j=1;j<=n;j++,k++){
			 if(k<10)
				 System.out.print(k+" ");
			 else{
				 k=1;
				 System.out.print(k+" ");
			 }
		 }
		 System.out.println();
	 }
}
}
