package arrays.Assignment1.solution8;

public class SetMismatch {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums= {1,2,2,4};
		int [] arr=s.findErrorNums(nums);
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]+" ");
		}
	}
	

}
