package Arrays;

public class HighestGap {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		
		int[] a = ao.readElement();
		System.out.println("Entered array elements are: ");
		ao.dispArr(a);
		
		int[] ele = ao.highestGap(a);
		System.out.println("Highest gap between the elements are:");
		ao.dispArr(ele);
		//ao.highestGap1(a);
	}

}
