package arrays.Assignment1.solution2;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Please Enter the  value to remove");
		int val = sc.nextInt();
		sc.close();
		Solution s=new Solution();
		System.out.println("The size of array after removing element is :"+s.removeElement(nums, val));

	}

}
