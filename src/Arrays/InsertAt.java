package Arrays;

public class InsertAt {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		ao.dispArr(a);
		int[] b = ao.insertAt(a, 5, 1);
		ao.dispArr(b);
	}

}
