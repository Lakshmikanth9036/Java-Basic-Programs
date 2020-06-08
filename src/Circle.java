import java.util.Scanner;

public class Circle {
public static void main(String args[]){
	double radius,area,circumference,pie=3.14;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	radius=in.nextDouble();
	area=pie*radius*radius;
	circumference=2*pie*radius;
	System.out.println("The area of the circle is "+area);
	System.out.println("The circumference of the circle is "+circumference);
}
}
