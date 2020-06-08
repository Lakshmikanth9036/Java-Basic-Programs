import java.util.Scanner;
public class BiggestOf4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c,d,max;
		System.out.println("Enter the 4 numbers");
		System.out.println("Enter 1st number");
		a=in.nextInt();
		System.out.println("Enter 2st number");
		b=in.nextInt();
		System.out.println("Enter 3st number");
		c=in.nextInt();
		System.out.println("Enter 4st number");
		d=in.nextInt();
		max=((a>b)&&(a>c)&&(a>d))?a:((b>c)&&(b>d))?b:(c>d)?c:d;
		System.out.println("The greatest number is: "+max);
	}

}
