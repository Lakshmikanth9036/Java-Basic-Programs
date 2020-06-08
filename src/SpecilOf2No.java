import java.util.Scanner;

public class SpecilOf2No {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any 2 digit number");
		int n=in.nextInt();
		int d=n/10;//gives first digit of the no. like 4 in 45
		int r=n%10;//gives second digit of the no. like 5 in 45
		int spec=(d+r)+(d*r);//formula of special 2 digit number
		if(spec==n)
			System.out.println(n+" is a special 2 digit no.");
		else
			System.out.println(n+" is not a special 2 digit no.");
	}
}
