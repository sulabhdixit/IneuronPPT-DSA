package arrays.Assignment1.solution8;

class Solution {
		  public int[] findErrorNums(int[] nums) {
				int [] n1=new int[nums.length+1];
				int [] arr =new int[2];
				for(int i:nums){
					    n1[i]++;    
				}
				for(int i=0;i<n1.length-1;i++){
					if(n1[i]==0) {
						arr[1]=i;
					}
					if(n1[i]==2){
				     arr[0]=i;
					}
				}
				
		   return  arr;
		  }
}
