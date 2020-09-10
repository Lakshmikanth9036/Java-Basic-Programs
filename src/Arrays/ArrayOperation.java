package Arrays;

import java.util.Scanner;

public class ArrayOperation {

	private ArrayOperation(){

	}

	private static ArrayOperation ao;

	static{
		ao = new ArrayOperation();
	}

	public final static ArrayOperation getInstance(){
		return ao;
	}

	int[] readElement()
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int n = in.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the "+n+" elements");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		in.close();
		return a;
	}

	void dispArr(int[] a)
	{
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	int sumOfArr(int[] a){
		int sum=0;
		for(int i=0; i<a.length; i++){
			sum = sum+a[i];
		}
		return sum;
	}

	int[] countEO(int[] a){
		int c[]={0,0};
		for(int i=0; i<a.length; i++){
			/*if(a[i]%2==0)
				c[0]++;
			else
				c[1]++;*/
			c[a[i]%2]++;
		}
		return c;
	}

	int[] countPN(int[] a){
		int[] c={0,0};
		for(int i=0; i<a.length; i++){
			if(a[i]>0)
				c[0]++;
			else
				c[1]++;
		}
		return c;
	}

	int smallest(int[] a){
		int smallest = a[0];
		for(int i=0; i<a.length; i++){
			if(smallest>a[i])
				smallest=a[i];
		}
		return smallest;
	}

	static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}

	int noOfPrimeNo(int[] a){
		int count = 0;
		for(int i=0; i<a.length; i++){
			if(isPrime(a[i])==true)
				count++;
		}
		return count;
	}

	static boolean isPalin(int n){
		int rev=0, temp=n;
		while(n!=0){
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev==temp;
	}

	int noOfPalin(int[] a){
		int count=0;
		for(int i=0; i<a.length; i++){
			if(isPalin(a[i])==true)
				count++;
		}
		return count;
	}

	int[] sumOfEO(int[] a){
		int c[]={0,0};
		for(int i=0; i<a.length; i++){
			/*if(a[i]%2==0)
				c[0]=c[0]+a[i];
			else
				c[1]=c[1]+a[i];*/
			c[a[i]%2] = c[a[i]%2]+a[i];
		}
		return c;
	}

	int[] merge(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		for(int i=0; i<a.length; i++){
			c[i] = a[i];
		}

		for(int i=0; i<b.length; i++){
			c[a.length+i] = b[i];
		}
		return c;
	}

	int[] insertAt(int[] a, int ele, int i){

		if(i<0 || i>a.length){
			System.out.println("Enter the valid index");
			return a;
		}

		int[] b = new int[a.length+1];
		b[i] = ele;

		for(int j=0; j<a.length; j++){
			if(j<i)
				b[j] = a[j];
			else
				b[j+1] = a[j];
		}
		return b;
	}

	int[] deleteAt(int[] a, int i){

		if(i<0 || i>=a.length){
			System.out.println("Enter the valid index");
			return a;
		}

		int[] b = new int[a.length-1];

		for(int j=0; j<b.length; j++){
			if(j<i)
				b[j] = a[j];
			else
				b[j] = a[j+1];
		}
		return b;
	}

	int[] reverseArr(int[] a){
		int n = a.length;
		int n1 = a.length/2;
		for(int i=0 ; i<n1; i++){
			int temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}
		return a;
	}

	int[] merge2SotredArr(int[] a ,int[] b){
		int[] c = new int[a.length+b.length];
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length){
			if(a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}

		while(i<a.length){
			c[k++] = a[i++];
		}

		while(j<b.length){
			c[k++] = b[j++];
		}
		return c;
	}

	int[] mergeInZigZagOrd(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length && i<b.length){
			c[k++]=a[i];
			c[k++]=b[i++];
		}
		while(i<a.length){
			c[k++] = a[i++];
		}

		while(i<b.length){
			c[k++] = b[i++];
		}
		return c;
	}

	int nthBiggest(int[] a,int n){
		for(int i = 0; i<a.length; i++){
			int count = 0;
			for(int j=0; j<a.length; j++){
				if(a[i] < a[j])
					count++;
			}
			if(count==n-1)
				return a[i];
		}
		return 0;
	}

	int nthSmallestt(int[] a,int n){
		for(int i = 0; i<a.length; i++){
			int count = 0;
			for(int j=0; j<a.length; j++){
				if(a[i] > a[j])
					count++;
			}
			if(count==n-1)
				return a[i];
		}
		return 0;
	}

	int[] highestGap(int[] a){
		int gap=0;
		int k = 0;
		int[] gapbw= new int[2];
		for(int i=0; i<a.length; i++){
			int j=i+1;
			if(j<a.length){
				int g = a[i]-a[j];
				if(g<0){
					g = -1*g;
				}
				if(g>gap){
					gap = g;
					k = i;
				}
			}
		}
		gapbw[0] =a[k];
		gapbw[1] = a[k+1];
		return gapbw;
	}

	void highestGap1(int[] a){
		int a1=a[0];
		int b1=a[1];
		int gap = a1 - b1;
		if(gap<0){
			gap= gap*-1;
		}
		for (int i = 1; i < a.length-1; i++) {
			int g = a[i]-a[i+1];
			if(g<0)
				g=g*-1;
			if(g>gap){
				gap=g;
				a1=a[i];
				b1=a[i+1];
			}
		}
		System.out.println(a1+" "+b1);
	}

	int[] highestSum(int[] a){
		int sum=0;
		int k = 0;
		int[] gapbw= new int[2];
		for(int i=0; i<a.length; i++){
			int j=i+1;
			if(j<a.length){
				int s = a[i]+a[j];

				if(s>sum){
					sum = s;
					k = i;
				}
			}
		}
		gapbw[0] =a[k];
		gapbw[1] = a[k+1];
		return gapbw;
	}

	int highestSum1(int[] a){
		int sum = a[0]+a[1];
		for(int i=1; i<a.length-1; i++){
			if(a[i]+a[i+1] > sum)
				sum = Math.abs(a[i]+a[i+1]);
		}
		return sum;
	}

	void frequency(int[] a){
		//		int[] counts = new int[a.length];
		//		int visited = -1;
		int n = a.length;
		for(int i=0; i<n; i++){
			int count = 1;
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j]){
					count++;
					a[j] = a[n-1];
					j--;
					n--;
				}
			}
			//			if(counts[i]!=visited)
			//				counts[i] = count;
			System.out.println(a[i]+"---->"+count);
		}

		//		for(int i=0; i<counts.length; i++){
		//			if(counts[i]!=visited){
		//				System.out.println(a[i]+" element occurs "+counts[i]+" times");
		//			}
		//		}
	}

	int[] unique(int[] a){
		int[] unique = new int[a.length];
		int k = 0;
		for(int i = 0; i < a.length; i++){
			boolean uq = true;
			for(int j = 0 ; j < a.length; j++){
				if(a[i]==a[j]&& i!=j){
					uq = false;
					break;
				}
			}
			if(uq)
				unique[k++]=a[i];
		}
		int[] unq = new int[k];
		for (int i = 0; i < unq.length; i++) {
			unq[i] = unique[i];
		}
		return unq;
	}
		

	int[] commomEle(int[] a, int[] b){
		int[] common = new int[a.length];
		int k=0;
		for(int i=0;i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					common[k++] = a[i];
					break;
				}
			}
		}
		
		int[] com = new int[k];
		for(int i=0; i<com.length; i++){
				com[i]=common[i];
		}
		return com;
	}
	
	int[] removeDuplicate(int[] a){
		int[] u = new int[a.length];
		u[0] = a[0];
		int k=1;
		for (int i = 1; i < a.length; i++) {
			int j = i-1;
			while(j>=0 && a[i]!=a[j]){
				j--;
			}
			if(j==-1){
				u[k++] = a[i];
			}
		}
		
		int[] noDup = new int[k];
		for (int i = 0; i < noDup.length; i++) {
			noDup[i] = u[i];
		}
		return noDup;
	}
}
