import java.util.Arrays;
import java.util.Scanner;

public class SptHgtTo2Val {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n+1];
		int highest=a[0];
		int shighest=a[0];
		int j=0,k=0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for (int i=0;i<a.length;i++){
			if(a[i]>highest){
				highest=a[i];
				j=i;
			}
		}
		for (int i=0;i<a.length;i++){
			if(a[i]<highest && a[i]>shighest){
				shighest=a[i];
			}
		}
		highest=highest-shighest;
		for(int i=0;i<a.length;i++,k++){
			if(i==j){
				b[i]=shighest;
				b[i+1]=highest;
				k=i+1;
			}
			else
				b[k]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}
}
