import java.util.Scanner;

public class HappyNumber {
	
	static boolean isHappyNo(int n){
		int once,twice;
		once=twice=n;
		do{
			once=val(once);
			twice=val(val(twice));
		}while(once!=twice);
		return once==1;
	}
	
	static int val(int n){
		int sum=0;
		while(n!=0){
			sum=sum+(n%10)*(n%10);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		boolean res=isHappyNo(n);
		if(res==true)
			System.out.println("Happy number");
		else 
			System.out.println("Not happy number");
	}
}
