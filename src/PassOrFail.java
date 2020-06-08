import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the marks of 4 subjects");
		int m1=in.nextInt();
		int m2=in.nextInt();
		int m3=in.nextInt();
		int m4=in.nextInt();
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35)
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}
