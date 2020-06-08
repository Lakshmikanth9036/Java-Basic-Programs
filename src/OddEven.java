import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		/*if(n==0)
			System.out.println("Zero");
		else*/ if(n%2==0)
			System.out.println(n+" is a even number");
		else
			System.out.println(n+" is a odd number");
	}

}
