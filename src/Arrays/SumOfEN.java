package Arrays;

public class SumOfEN {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		ao.dispArr(a);
		int[] c = ao.sumOfEO(a);
		System.out.println("Sum of Even: "+c[0]+" Sum of odd: "+c[1]);
	}

}
