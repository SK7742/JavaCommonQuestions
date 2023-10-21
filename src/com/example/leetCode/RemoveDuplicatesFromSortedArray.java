package com.example.leetCode;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 0, 0, 0, 3, 3 };
		int x = removeDuplicateElement_Approach_2(nums);
		for (int i = 0; i < x; i++) {
			System.out.print(" " + nums[i]);
		}
	}

	// Approach 1
	private static int removeDuplicateElement_Approach_1(int[] nums) {
		int hits = 0;
		int maxNumber = Integer.MIN_VALUE;
		for (int x : nums) {
			if (maxNumber < x) {
				maxNumber = x;
				nums[hits++] = x;
			}
		}
		return hits;
	}

	// Approach 1
	private static int removeDuplicateElement_Approach_2(int[] nums) {
		int hits = 0;
		for (int x : nums) {
			if (hits == 0 || x != nums[hits - 1]) {
				nums[hits++] = x;
			}
		}
		return hits;
	}
}
