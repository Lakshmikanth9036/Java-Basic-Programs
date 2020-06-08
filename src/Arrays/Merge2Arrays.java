package Arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		ArrayOperation ao = ArrayOperation.getInstance();
		int[] a = ao.readElement();
		int[] b = ao.readElement();
		int[] c = ao.merge(a, b);
		System.out.println("Elements before merging");
		ao.dispArr(a);
		ao.dispArr(b);
		System.out.println("Elements after merging");
		for(int i=0 ;i<c.length; i++){
			System.out.print(c[i]+" ");
		}
	}

}
