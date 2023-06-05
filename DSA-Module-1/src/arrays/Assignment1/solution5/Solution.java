package arrays.Assignment1.solution5;
import java.util.Arrays;
public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// for(int i=m;i<nums1.length;i++){
		// nums1[i]=nums2[i-m];
		// }
		for (int i = 0; i < nums2.length; i++) {
			nums1[i + m] = nums2[i];
		}
		Arrays.sort(nums1);
		
		for(int i=0;i<nums1.length;i++) {
			System.out.print(" "+nums1[i]);
		}

	}
}
