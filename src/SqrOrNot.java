import java.util.Scanner;
class SqrOrNot{
	public static void main (String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Length");
		int l=in.nextInt();
		System.out.println("Enter the Breadth");
		int b=in.nextInt();
		if(l==b)
			System.out.println("Square");
		else
			System.out.println("Not Square");
		in.close();
	}
}