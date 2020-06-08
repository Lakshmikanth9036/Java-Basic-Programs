import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		if(n<0)
			System.out.println("Absolute value of "+n+" is "+(-1*n));
		else
			System.out.println("Absolute value "+n);
		in.close();
	}

}
