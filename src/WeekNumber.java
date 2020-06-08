import java.util.Scanner;
public class WeekNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int choice;
		System.out.println("Enter the number of the week");
		choice=in.nextInt();
		switch(choice){
		case 1:
			System.out.println("This day is Sunday");
			break;
		case 2:
			System.out.println("This day is Monday");
			break;
		case 3:
			System.out.println("This day is Tuesday");
			break;
		case 4:
			System.out.println("This day is Wednesday");
			break;
		case 5:
			System.out.println("This day is Thursday");
			break;
		case 6:
			System.out.println("This day is Friday");
			break;
		case 7:
			System.out.println("This month is Saturday");
			break;
	}
}
}



