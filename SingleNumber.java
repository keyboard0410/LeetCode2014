package leetcode;

public class SingleNumber {
	
	public static int solution(int[] arr) {
		int m = 0;
		for(int i = 0; i < arr.length; i++) {
			m = m^arr[i];
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
