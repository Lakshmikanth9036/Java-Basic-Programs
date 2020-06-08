package Arrays;

public class Smallest {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		ao.dispArr(a);
		int smallest = ao.smallest(a);
		System.out.println("Smallest element in the array is : "+smallest);
	}

}
