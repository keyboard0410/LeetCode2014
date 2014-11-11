package leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] A, int elem) {
		int len = A.length;
		int temp = 0;
		Arrays.sort(A);
		for(int i = 0; i < len; i++) {
			if(A[i] == elem) {
				for(int j = i; j < A.length; j++) {
					if(A[j] > elem) {
						A[j-temp] =  A[j];
					}
					else {
						temp++;
						continue;
					}
					
				}
				return len - temp;
				
			}
			else {
				continue;
			}
		}
		return len;
        
    }
	public static void main(String[] args) {
		int[] A = {4,5,8,8,8,10};
		System.out.println(removeElement(A, 8));

	}

}
