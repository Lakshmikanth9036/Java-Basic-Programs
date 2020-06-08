package SentanceProblem;

import java.util.Scanner;

public class NetBonus {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the service year in company");
		int ser=in.nextInt();
		System.out.println("Enter the Salary");
		int sal=in.nextInt();
		double bonus=sal*0.05;
		if(ser>5){
			System.out.println("Net Bonus is: "+bonus+" and net bonus amount is: "+(sal+bonus));
		}
		else
			System.out.println("No bonus year of service is less than 5 years");
	}
}
