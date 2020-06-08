import java.util.Scanner;

public class RangedFact {
	static int fact(int n){
		int fact=1,i=2;
		while(i<=n){
			fact=fact*i;
			i++;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(fact(i));
		}
	}

}
