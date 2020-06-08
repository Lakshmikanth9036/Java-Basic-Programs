package Arrays;

public class HighestSum {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		
		int[] a = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(a);
		
		int[] ele = ao.highestSum(a);
		System.out.println("Highest sum of 2 elements are:");
		ao.dispArr(ele);
		System.out.println(ao.highestSum1(a));
	}

}
