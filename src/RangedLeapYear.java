import java.util.Scanner;
public class RangedLeapYear {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=in.nextInt();
		int y1=((year/400)+(year/4))-(year/100);
		System.out.println("Number of leap year before "+year+" is: "+y1);
	}

}
