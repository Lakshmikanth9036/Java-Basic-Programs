package Arrays;

public class EvenOddNo {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a=ao.readElement();
		ao.dispArr(a);
		int[] c=ao.countEO(a);
		System.out.println("Even count: "+c[0]+" Odd count: "+c[1]);
		
	}

}
