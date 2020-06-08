package DS;

import java.util.Arrays;
import java.util.Scanner;

public class Mendring2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the "+n+" array element");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		int[] b = new int[a.length];
		
		int k = 0;
		
		for (int i = 0, j = a.length-1; i <= j; i++, j--) {
			b[k++] = a[j];
			if(k<b.length)
				b[k++] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			
		}
		in.close();
	}

}
