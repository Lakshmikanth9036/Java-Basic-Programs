import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the percentage");
		float per=in.nextFloat();
		if(per>=35){
			System.out.println("Pass");
			if(per>=85)
				System.out.println("Distinction");
			else if(per>=60)
				System.out.println("First class");
			else if(per<60)
				System.out.println("Second class");
		}
		else
			System.out.println("Fail");
	}

}
