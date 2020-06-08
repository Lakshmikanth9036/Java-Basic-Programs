package SentanceProblem;
import java.util.Scanner;

public class VoteElig {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=in.next();
		System.out.println("Enter your age");
		int age=in.nextInt();
		if(age>=18)
			System.out.println(name+" is eligiable to vote");
		else
			System.out.println(name+" not is eligiable to vote");
	}
}
