import java.util.Scanner;

public class Series {
/*	static int pow(int n,int p){
		int pow=1;
		while(p>0){
			pow=pow*n;
			p--;
		}
		return pow;
	}*/
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int p=1;
		for(int i=1;i<=n;i++){
			/*int val=i*pow(2,i-1);
			System.out.println(val);*/
			System.out.println(i*p);
			p=p*2;
		}
	}

}
