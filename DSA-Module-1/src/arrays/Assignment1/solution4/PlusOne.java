package arrays.Assignment1.solution4;

public class PlusOne {

	public static void main(String[] args) {
		int [] digits= {1,2,3};
		Solution s=new Solution();
		int [] arr=s.plusOne(digits);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

}
