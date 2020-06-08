package Arrays;

public class CommonEle {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(a);
		int[] b = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(b);
		System.out.println("Common elements in both the strings are: ");
		int[] com = ao.commomEle(a, b);
		ao.dispArr(com);
	}

}
