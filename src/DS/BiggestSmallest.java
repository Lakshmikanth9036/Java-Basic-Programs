package DS;

import java.util.Scanner;

public class BiggestSmallest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the "+n+" array element");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		for(int i=0 ; i<a.length; i=i+2){
			for(int j=i+1; j<a.length; j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			for(int j=i+2; j<a.length; j++){
				if(a[i+1]>a[j]){
					int temp = a[i+1];
					a[i+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0 ;i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		in.close();
	}

}
