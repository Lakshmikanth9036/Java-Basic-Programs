import java.util.Scanner;
public class Bmi {

	public static void main(String[] args) {
		double h,w,bmi,height;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the heigth in feet: ");
		h=in.nextDouble();
		System.out.print("Enter the weigth in kg: ");
		w=in.nextDouble();
		height=h*0.3048;//converting feet's to meter
		bmi=w/(height*height);
		System.out.print("Your bmi is "+bmi);
	}
}
