import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n,num,am=0,temp;
		System.out.println("Enter the number");
		n=in.nextInt();
		temp=n;
		while(n!=0){
			num=n%10;
			am=am+(num*num*num);
			n=n/10;
		}
		if(temp==am)
			System.out.println(temp+" is amstrong number");
		else
			System.out.println(temp+" is not amstrong number" );
	}
}
