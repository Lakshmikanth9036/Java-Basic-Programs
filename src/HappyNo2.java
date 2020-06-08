import java.util.Scanner;

public class HappyNo2 {
	
	static boolean isHappyNo(int n){
		while(n>9){
		int sum=0;
		while(n!=0){
			sum=sum+(n%10)*(n%10);
			n=n/10;
			System.out.println(sum);
		}
		n=sum;
		}
		return n==1||n==7;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		boolean res=isHappyNo(n);
		if(res==true)
			System.out.println("Happy number");
		else 
			System.out.println("Not happy number");
	}

}
