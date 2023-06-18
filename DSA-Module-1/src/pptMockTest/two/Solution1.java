package pptMockTest.two;

public class Solution1 {
	  public int mySqrt(int x) {
          if (x == 0) {
      return 0;
    }

    int start = 1;
    int end = x;
    while (start <= end) {
      int mid = (end + start) / 2;
      if (mid == x / mid) {
        return mid;
      } else if (mid < x / mid) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return end;
	  }
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int x=4;
		int n =s.mySqrt(x);
		System.out.println(n);
	}

}
