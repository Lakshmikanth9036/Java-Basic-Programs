import java.util.Scanner;

public class SumOfDIgUsgRec {
		static int sum(int n,int s){
			if(n!=0){
				return sum(n/10,s+n%10);
			}
			else
				return s;
		}
		public static void main( String args[] ) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the value of n");
			int n=in.nextInt();
			System.out.println(sum(n,0));

	}

}
