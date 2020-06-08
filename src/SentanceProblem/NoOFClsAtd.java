package SentanceProblem;
import java.util.Scanner;

public class NoOFClsAtd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of class held");
		int held=in.nextInt();
		System.out.println("Enter number of class attended");
		int att=in.nextInt();
		double per=(att*100)/held;
		System.out.println("If there is any medical reason enter y/Y");
		boolean ans=in.nextBoolean();
		if(per>75 || ans==true)
			System.out.println("Allow to sit in exam");
		else
			System.out.println("Don't allow to sit in exam");
	}

}
