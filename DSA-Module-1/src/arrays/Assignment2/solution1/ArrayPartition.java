package arrays.Assignment2.solution1;

import java.util.Arrays;

public class ArrayPartition {
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i = i + 2) {
			sum += nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2 };
		ArrayPartition a = new ArrayPartition();
		int n = a.arrayPairSum(nums);
		System.out.println(n);
	}

}
