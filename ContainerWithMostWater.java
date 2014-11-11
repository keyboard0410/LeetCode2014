package leetcode;

import java.util.Arrays;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		if(height == null || height.length < 2) {
			return 0;
		}
		int i = 0; 
		int j = height.length - 1;
		int maxArea = 0;
		while(i < j) {
			int area = 0;
			if(height[i] < height[j]) {
				area = height[i] * (j - i);
				i++;
			}
			else {
				area = height[j] * (j - i);
				j--;
			}
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
    }
	public static void main(String[] args) {
		int[] height = {3,2,1,3};

	}

}
