package Arrays;

public class Unique {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(a);
		a = ao.unique(a);
		System.out.println("Array after removing duplicate elements: ");
		ao.dispArr(a);
	}

}
