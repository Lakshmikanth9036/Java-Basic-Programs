import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=in.nextInt();
		int i=1;
		while(i<=n){
			if(i%3==0)
				System.out.println(i+" is the multiple of 3");
			i++;
		}
	}

}
