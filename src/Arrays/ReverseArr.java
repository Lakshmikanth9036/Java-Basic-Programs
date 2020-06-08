package Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		System.out.println("Entered array elements: ");
		ao.dispArr(a);
		int[] rev = ao.reverseArr(a);
		System.out.println("Array elements after reversing elements");
		ao.dispArr(rev);
	}

}
