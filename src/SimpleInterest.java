import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		float p,r,t,si;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the principle: ");
		p=in.nextFloat();
		System.out.print("Enter the Rate of interest: ");
		r=in.nextFloat();
		System.out.print("Enter the Time period: ");
		t=in.nextFloat();
		si=(p*r*t)/100;
		System.out.print("The simple interest is: "+si);
	}

}
