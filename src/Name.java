import java.util.Scanner;

public class Name {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=in.nextLine();
		System.out.println("Enter the number of times you want to print your name");
		int n=in.nextInt();
		while(n!=0){
			System.out.println(name);
			n--;
		}
		
	}

}
