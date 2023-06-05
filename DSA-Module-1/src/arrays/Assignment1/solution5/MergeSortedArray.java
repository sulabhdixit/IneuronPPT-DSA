package arrays.Assignment1.solution5;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 4, 5, 6 };
		int m, n;
		m = 0;
		n = 0;
		for (int i=0 ;i<nums1.length;i++) {
			if (nums1[i] > 0) {
				m += 1;
			}
		}
		for (int j=0;j<nums2.length;j++) {
			if (nums2[j] > 0) {
				n += 1;
			}
		}
		Solution s = new Solution();
		s.merge(nums1, m, nums2, n);
	}

}
