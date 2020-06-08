package Arrays;

public class NthSmallest {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		
		int[] a = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(a);
		int smallest = ao.nthSmallestt(a, 4);
		System.out.println("4th smallest element is: "+smallest);
	}

}
