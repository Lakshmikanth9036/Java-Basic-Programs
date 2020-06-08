package Arrays;

public class SumOfEleMeth {
	
	public static void main(String[] args) {
		
		ArrayOperation ao = ArrayOperation.getInstance();
		
		int[] a = ao.readElement();
		
		ao.dispArr(a);
		
		int sum = ao.sumOfArr(a);
		System.out.println("Sum of array elements: "+sum);
	}

}
