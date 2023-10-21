package com.example.leetCode;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int target = 2;
		int x = removeElement(nums, target);
		for(int i =0 ; i<x ;i++) {
			System.out.print(" " + nums[i]);
		}
	}
	public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }
}
