package Arrays;

public class OccurenceOfEle {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a=ao.readElement();
		System.out.println("Entered first sorted array elements are: ");
		ao.dispArr(a);
		ao.frequency(a);
	}
}
