import java.util.Scanner;
public class Middle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter 3 distinct number");
		n1=in.nextInt();
		n2=in.nextInt();
		n3=in.nextInt();
		if(n1==n2||n2==n3||n3==n2)
			System.out.println("Duplicate values found");
		else
		{
			if(n1<n2 && n1>n3||n1>n2 && n1<n3)
				System.out.println(n1+" is middle value");
			else if(n2<n3 && n2>n1||n2>n3 && n2<n1)
				System.out.println(n2+" is middle value");
			else
				System.out.println(n3+" is middle value");
		}
	}

}
