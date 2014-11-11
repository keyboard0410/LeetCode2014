package leetcode;

import java.util.Arrays;

public class MaxArea {
	
	public static int solution(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
		int m = height[0];
		for(int k = 1; k < height.length; k++) {
			if(height[k] > m) {
				m = height[k];
			}
		}
		int max = 0;
		for(int i = 1; i <= m; i++) {
			int count = 0;
			for(int j = 0; j < height.length; j++) {
				if(height[j] >= i) {
					count++;
					max = Math.max(max, (i)*count);
				}
				else {
					count = 0;
				}
			}
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {6, 2};
		solution(arr);
	}

}
