import java.util.Scanner;
public class LeastOfTwo {
	public static void main(String[] args){
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of 'a' and 'b'");
		a=in.nextInt();
		b=in.nextInt();
		if(a>b)
			System.out.println("The value of b="+b+" is less than value of a="+a);
		else
			System.out.println("The value of a="+a+" is less than value of b="+b);
	}
}
