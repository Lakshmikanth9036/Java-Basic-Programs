import java.util.Scanner;

public class ArmstrongOfAllDig {
	static boolean isArmstrong(int n){
		int count=count(n);
		int arm=0,temp=n;
		do{
			int r=n%10;
			arm=arm+pow(r,count);
			n=n/10;
		}while(n!=0);

		return temp==arm;
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
		/*System.out.println("Enter the value of n");
		int n=in.nextInt();*/
		for(int i=1;i<=10000;i++){
			boolean res=isArmstrong(i);
			if(res==true)
				System.out.println(i);
		}
	}
}
