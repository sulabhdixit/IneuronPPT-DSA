package arrays.Assignment1.solution2;

import java.util.*;

public class Solution {
	public int removeElement(int[] nums, int val) {
		Arrays.sort(nums);

		int k = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				nums[i] = nums[nums.length - 1] + 1;
				k -= 1;
			}
		}
		Arrays.sort(nums);
		return k;

	}
}
