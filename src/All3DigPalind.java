
public class All3DigPalind {
	static boolean isPalin(int n){
		int rev=0,temp=n;
		while(n!=0){
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev==temp;
	}
	public static void main( String args[] ) {
		int n=1,count=0;
		for(int i=101;i<=999;i++){
			boolean res=isPalin(i);
			if(res==true)
				System.out.println(i);
		}
}
}
