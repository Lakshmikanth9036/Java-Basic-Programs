import java.util.Scanner;
public class Rectangle {
public static void main(String args[]){
	float l,b,perimeter,area;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the length of the rectangle: ");
	l=in.nextFloat();
	System.out.print("Enter the breadth of the rectangle: ");
	b=in.nextFloat();
	perimeter=2*(l+b);
	System.out.print("The perimeter of the rectangle is: "+perimeter);
	area=l*b;
	System.out.print("The area of the rectangle is: "+area);
}
}
