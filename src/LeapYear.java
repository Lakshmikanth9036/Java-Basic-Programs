import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the year");
		n=in.nextInt();
		if(n%400==0)
			System.out.println(n+" is a Leap year");
		else if(n%100==0)
			System.out.println(n+" is not a Leap year");
		else if(n%4==0)
			System.out.println(n+" is a Leap year");
		else
			System.out.println(n+" is not a Leap year");

	}

}
