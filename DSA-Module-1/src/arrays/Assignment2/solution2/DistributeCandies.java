package arrays.Assignment2.solution2;

import java.util.Arrays;

public class DistributeCandies {
	public int distributeCandies(int[] candyType) {
		
		Arrays.sort(candyType);
		
		int count = 1;
		for (int i = 0; i + 1 < candyType.length; i++) {
			if (candyType[i] != candyType[i + 1]) {
				count += 1;
			}
		}


		if (count > candyType.length / 2) {
			count = candyType.length / 2;
		}

		return count;
	}

	public static void main(String[] args) {
		int[] candyType = //{ 6, 6, 6, 6 };
		// {1,1,2,3};
		{1,1,2,2,3,3,};
		DistributeCandies d = new DistributeCandies();
		System.out.println(d.distributeCandies(candyType));
	}

}
