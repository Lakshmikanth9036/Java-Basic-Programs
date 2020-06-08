package SentanceProblem;
import java.util.Scanner;
public class TenPerDis {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the quantity");
		int quant=in.nextInt();
		System.out.println("Enter the unit cost");
		int unitcost=in.nextInt();
		int total=quant*unitcost;
		double dis=0.1*total;
		if(total>1000){
			System.out.println("Total cost before discount: "+total);
			System.out.println("You get the dis of "+dis+" and your total cost is "+(total-dis));
		}
		else{
			System.out.println("No discount");
	}
}
}
