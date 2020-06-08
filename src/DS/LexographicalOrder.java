package DS;

import java.util.Scanner;

public class LexographicalOrder {
	
	static int digit(int n, int i){
		int a=0;
		do{
			a=n%10;
			n=n/10;
		}while(n>i);
		return a;
	}
	
	/*static int count(int n){
		int count=0;
		do{
			count++;
			n =n/10;
		}while(n!=0);
		return count;
	}*/
	
	static boolean compare(int a, int b){
		/*int ac=count(a),bc=count(b);*/
		int i = 0, k = 0;
		int x=digit(a,i);
		int y=digit(b,k);
		if(x==y){
			x = digit(a, (i+1)*10-1);
			y = digit(b, (k+1)*10-1);
			/*System.out.println(x+""+y);*/
		}
			
		if(x<y)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the "+n+" elements: ");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(compare(a[i], a[j]) == true){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		in.close();
	}

}
