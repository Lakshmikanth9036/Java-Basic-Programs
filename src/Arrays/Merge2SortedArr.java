package Arrays;

public class Merge2SortedArr {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a=ao.readElement();
		System.out.println("Entered first sorted array elements are: ");
		ao.dispArr(a);
		int[] b=ao.readElement();
		System.out.println("Entered second sorted array elements are: ");
		ao.dispArr(b);
		int[] c = ao.merge2SotredArr(a, b);
		System.out.println("Array after merging 2 sorted array");
		ao.dispArr(c);
	}

}
