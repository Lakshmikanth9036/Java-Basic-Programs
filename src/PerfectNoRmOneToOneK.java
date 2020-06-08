
public class PerfectNoRmOneToOneK {
	static boolean isPerfect(int n){
		int sum=0,i=1,temp=n;
		while(i<=n/2){
			if(n%i==0){
				sum=sum+i;
			}
			i++;
		}
		return sum==temp;
	}
	public static void main( String args[] ) {
		int n=1,count=0;
		for(int i=1;i<=1000;i++){
			boolean res=isPerfect(i);
			if(res==true)
				System.out.println(i);
		}
}
}
