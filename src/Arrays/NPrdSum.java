package Arrays;

import java.util.Scanner;

public class NPrdSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int n = in.nextInt();
		double[] price = new double[n];
		double total=0;
		System.out.println("Enter the "+n+" product price");
		for(int i=0; i<n; i++){
			price[i] =in.nextDouble();
		}
		for(int i=0; i<price.length; i++){
			System.out.println(i+1+" product price is "+price[i]);
			total = total+price[i];
		}
		System.out.println("Total price of "+n+" product is "+total);
		in.close();
	}

}
