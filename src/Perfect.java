import java.util.Scanner;
public class Perfect {
	/*perfect number means sum of the divisor of n except n itself must be equal to n.
	Example 6 is divisible by 1,2,3 we have to exclude 6 so sum of divisor is 1+2+3=6 
	which is equal to 6 hence 6 is a perfect number*/

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=in.nextInt();
		int i=1,sum=0;
		while(i<=n/2){
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==n)
			System.out.println(n+" is a perfcet number");
		else
			System.out.println(n+" is not a perfect number");
	}

}
