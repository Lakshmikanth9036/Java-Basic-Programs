import java.util.Scanner;

public class RangedDesarium {

	static boolean isDesarium(int n){
		int count=count(n) ;
		int sum=0,temp=n;
		while (n!=0){
			int r=n%10;
			sum=sum+pow(r, count);
			n=n/10;
			count--;
		}
		return sum==temp;
	}
	static int pow(int n,int p){
		int pow=1;
		while(p>0){
			pow=pow*n;
			p--;
		}
		return pow;
	}
	static int count(int n){
		int count=0;
		do{
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
		boolean res=isDesarium(i);
		if(res==true)
			System.out.println(i);
		}
	}
}
