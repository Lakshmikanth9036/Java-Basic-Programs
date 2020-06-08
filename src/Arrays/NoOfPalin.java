package Arrays;

public class NoOfPalin {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		ao.dispArr(a);
		int palinCount = ao.noOfPalin(a);
		System.out.println("Number of palindrome in array are: "+palinCount);
	}

}
