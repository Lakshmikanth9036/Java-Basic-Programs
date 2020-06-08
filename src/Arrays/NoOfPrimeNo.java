package Arrays;

public class NoOfPrimeNo {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		ao.dispArr(a);
		int primecount = ao.noOfPrimeNo(a);
		System.out.println("Number of prime elements in array are: "+primecount);
	}

}
