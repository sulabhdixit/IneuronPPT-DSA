package arrays.Assignment1.solution1;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements of array");
		for (int i=0 ;i<size; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Please Enter the target value");
		int target = sc.nextInt();
		sc.close();

		Solution s = new Solution();
		int[] ar = s.twoSum(nums, target);

		if (ar.length == 2) {
			System.out.println("[" + ar[0] + "," + ar[1] + "]");
		}

	}

}
