package Recursion;

public class BinarySearch {
	
	static int binarySearch(int[] a, int f, int l, int ele){
		if(f>l)
			return -1;
		int mid = (f+l)/2;
		if(a[mid]==ele)
			return mid;
		if(a[mid]<ele)
			f=mid+1;
		else
			l=mid-1;
		return binarySearch(a, f, l, ele);
	}

	public static void main(String[] args) {
		int[] a = {15, 23, 45, 56, 78, 92};
		int index = binarySearch(a, 0, a.length-1, 78);
		System.out.println("Given element is present in: "+index);
	}

}
