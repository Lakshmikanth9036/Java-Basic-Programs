package Arrays;

public class NthBiggest {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		
		int[] a = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(a);
		int biggest = ao.nthBiggest(a, 3);
		System.out.println("3rd biggest element is: "+biggest);
	}

}
