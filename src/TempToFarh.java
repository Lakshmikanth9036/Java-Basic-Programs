import java.util.Scanner;

public class TempToFarh {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double cels,fahre;
		System.out.print("Enter the temperature in celsius: ");
		cels=in.nextDouble();
		fahre=((cels*9)/5)+32;
		System.out.println(cels+" celsius in Fahrenhit is: "+fahre);		
	}
}
