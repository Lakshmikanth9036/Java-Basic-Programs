import java.util.Scanner;

public class Average {
	public static void main(String args[]){
		int mark[]=new int[4];
		int i;
		float perc,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the marks obtained in 4 subjects: ");
		for(i=0;i<4;i++){
			mark[i]=in.nextInt();
			sum=sum+mark[i];
		}
		perc=(sum/400)*100;
		System.out.println("Toltal marks: "+sum);
		System.out.println("Percentage: "+perc);	
	}
}
