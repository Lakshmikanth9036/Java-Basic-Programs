package SentanceProblem;
import java.util.Scanner;
public class ElderAndYounger {
	public static void main(String args[]){
		String name1,name2,name3,elder,younger;
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age and name of the First person");
		a=in.nextInt();
		name1=in.next();
		System.out.println("Enter the age and name of the Second person");
		b=in.nextInt();
		name2=in.next();
		System.out.println("Enter the age and name of the Third person");
		c=in.nextInt();
		name3=in.next();
		elder=((a>b)&&(a>c))?name1:(b>c)?name2:name3;
		younger=((a<b)&&(a<c))?name1:(b<c)?name2:name3;
		System.out.println(elder+" is the oldest");
		System.out.println(younger+" is the youngest");
	}
}
