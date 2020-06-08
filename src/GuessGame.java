import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Guess the number b/w (0-9)");
		int gno=in.nextInt();
		int rno=rd.nextInt(10);
		if(rno==gno)
			System.out.println("Your guess is correct");
		else
			System.out.println("Your guess was incorrect it was: "+rno);
	}

}
