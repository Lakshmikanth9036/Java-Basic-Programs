package SentanceProblem;
import java.util.Scanner;

public class PlcOfSrv {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the age");
		int age=in.nextInt();
		System.out.println("Enter gender M/F");
		String gender=in.next();
		System.out.println("Enter marital status Y/N");
		boolean MS=in.nextBoolean();
		if(gender.equalsIgnoreCase("f"))
			System.out.println("She will work only in urben areas");
		else if(age>20 && age<=40)
			System.out.println("He may work anywhere");
		else if(age>40 && age<=60)
			System.out.println("He will work in urban areas only");
		else
			System.out.println("Error");
	}

}
