import java.util.Scanner;

public class HowManyBitsAreSet {
	static int count(int n){
		int count=0;
		do{
			int r=n%2;
			count=count+r;
			n=n/2;
		}while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(count(n));
	}

}
