package Pattren;
import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
