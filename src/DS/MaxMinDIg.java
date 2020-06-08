package DS;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDIg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();
		String s = ""+n;
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int max = 0;
		
		for(int i=c.length-1; i>=0; i--){
			max = max*10+(c[i]-48);
		}
		
		int min = 0;
		for(int i=0; i<c.length;i++){
			System.out.println(i);
			int zc=0;
			while(i<c.length && c[i]=='0'){
				zc++;
				i++;
			}
			min = min*10 +(c[i]-48);
			while(zc>0){
				min = min*10;
				zc--;
			}
		}
		
		/*int ni = 0;
		while(ni < c.length && c[ni]==0)
			ni++;
		char t = c[0];
		c[0] = c[ni];
		c[ni] = t;
		for(int i=0; i<c.length; i++){
			min = min*10+(c[i]-48);
		}*/
		System.out.println(min);
		System.out.println(max);
		in.close();
	}
}
