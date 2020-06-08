import java.util.Scanner;

public class OddAndEvenSum {

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the natural number");
		int n=in.nextInt();
		int osum=0,esum=0;
		for(int i=1;i<=n;i++){
			if(i%2==0)
				esum=esum+i;
			else
				osum=osum+i;
		}
		System.out.println("The sum of even no. "+esum);
		System.out.println("The sum of odd no. "+osum);
	}
}
