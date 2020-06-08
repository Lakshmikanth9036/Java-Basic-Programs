package Arrays;

public class DeleteArrEle {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		System.out.println("Entered array elements are");
		ao.dispArr(a);
		int[] b = ao.deleteAt(a, 2);
		System.out.println("Array elements after deletion");
		ao.dispArr(b);
	}

}
