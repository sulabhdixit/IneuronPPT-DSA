package pptMockTest.one;

public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
		int len = s.length();

		if (len == 0) {
			return -1;
		}

		int[] arr = new int[26];

		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}

		for (int i = 0; i < len; i++) {
			if (arr[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		String s="leetcode";
		FirstUniqueCharacter f=new FirstUniqueCharacter();
		int n=f.firstUniqChar(s);
		System.out.println(n);
	}

}
