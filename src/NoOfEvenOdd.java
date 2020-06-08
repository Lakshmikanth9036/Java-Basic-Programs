import java.util.Scanner;
//Wrong program
public class NoOfEvenOdd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,evens,EvenCount=0,OddCount=0,odds;
		System.out.println("Enter any number");
		int num=in.nextInt();
		while(num!=0){
			n=num%10;
			num=num/10;
			if(n%2==0){
				evens=n;
				if(evens!=0){
					evens=evens/10;
					EvenCount++;
				}
			}
			else
			{
				odds=n;
				if(odds!=0){
					odds=odds/10;
					OddCount++;
				}
			}
		}
		System.out.println("Number of even digits "+EvenCount+" and number of odd digits "+OddCount);
	}

}
