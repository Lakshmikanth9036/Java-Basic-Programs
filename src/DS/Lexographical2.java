package DS;

import java.util.Scanner;

public class Lexographical2 {

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
				
				String s1 = ""+a[i];
				String s2 = ""+a[j];
				
				if(s1.compareTo(s2)<0){
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
