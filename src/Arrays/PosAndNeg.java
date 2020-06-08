package Arrays;

public class PosAndNeg {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		ao.dispArr(a);
		int[] c = ao.countPN(a);
		System.out.println("Positive :"+c[0]+" Negative: "+c[1]);
	}

}
