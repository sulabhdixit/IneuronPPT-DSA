package arrays.Assignment2.solution3;

import java.util.*;

public class LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
		int[] count = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] - nums[j] == 1 || nums[i] - nums[j] == -1||nums[i]==nums[j]) {
					count[i] += 1;
				}
			}
		}
		Arrays.sort(count);
		int max=count[count.length-1];

		
		return max+1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
		LongestHarmoniousSubsequence h = new LongestHarmoniousSubsequence();
		int s = h.findLHS(nums);
		System.out.println(s);
	}

}
