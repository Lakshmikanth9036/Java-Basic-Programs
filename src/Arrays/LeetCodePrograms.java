package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodePrograms {

	public static int removeDuplicates(int[] nums) {
		int len = 0;
		int i = 0;
		while (i < nums.length) {
			while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				i++;
			}
			i++;
			len++;
			if (i < nums.length) {
				nums[len] = nums[i];
			}
		}
		return len;
	}

	public static int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] < prices[j]) {
					max = max + (prices[j] - prices[i]);
				}
			}
		}
		return max;
	}

	public static void rotate(int[] nums, int k) {

		if (nums.length == 1) {
			return;
		}

		while (k > 0) {
			int i = 1, cur = nums[0], next = nums[i];
			while (i < nums.length) {
				nums[i] = cur;
				cur = next;
				i = i + 1;
				if (i < nums.length) {
					next = nums[i];
				}
			}
			nums[0] = next;
			k--;
		}
	}

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			count.putIfAbsent(nums[i], 0);
			count.put(nums[i], count.get(nums[i]) + 1);
			if (count.get(nums[i]) > 1) {
				return true;
			}
		}
		return false;
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			count.putIfAbsent(nums[i], 0);
			count.put(nums[i], count.get(nums[i]) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int k = 0;
		int[] itrsctele = new int[nums1.length + nums2.length];

		int p = 0, q = 0;

		while (p < nums1.length && q < nums2.length) {
			if (nums1[p] == nums2[q]) {
				itrsctele[k++] = nums1[p];
				p = p + 1;
				q = q + 1;
			} else if (nums1[p] < nums2[q]) {
				p = p + 1;
			} else if (nums1[p] > nums2[q]) {
				q = q + 1;
			}
		}

		int[] ele = new int[k];
		for (int i = 0; i < k; i++) {
			ele[i] = itrsctele[i];
		}
		return ele;
	}

	public static int[] plusOne(int[] digits) {
		int[] pone = new int[digits.length + 1];
		int i = digits.length - 1, carry = 1, n = pone.length - 1;
		while (i >= 0) {
			int temp = digits[i] + carry;
			if (temp == 10) {
				pone[n--] = 0;
				carry = 1;
				i--;
			} else {
				pone[n--] = temp;
				carry = 0;
				i--;
			}
		}
		if (carry == 1) {
			pone[0] = 1;
		}
		int[] resized = new int[digits.length];
		if (pone[0] == 0) {
			for (int m = 0; m < resized.length; m++) {
				resized[m] = pone[m + 1];
			}
			return resized;
		}
		return pone;
	}

}
