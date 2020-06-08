import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num,rev=0,remainder;
		System.out.println("Enter any number");
		num=in.nextInt();
		int n=num;
		while(num!=0){
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		if(rev==n)
			System.out.println(n+" is a palindrome "+rev);
		else
			System.out.println(n+" is not a palindrime "+rev);
	}

}
