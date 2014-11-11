package leetcode;

public class SortColors {
	public static void sortColors(int[] A) {
		if (A == null || A.length == 0) {
			return;
		}
		
		int redIndex = 0;
		int blueIndex = A.length - 1;
		int i = 0;
		
		while (i <= blueIndex) {
			if (A[i] == 0) {
				swap(A, redIndex, i);
				i++;
				redIndex++;
			} else if (A[i] == 1) {
				i++;
			} else {
				swap(A, blueIndex, i);
				blueIndex--;
				
			}
		}
	}
	
	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void main(String[] args) {
		int[] A = {1,2,1,2,1,0,1,0,2,2,1,2,0,1,0,1,2,1};
		sortColors(A);
		for(int i : A) {
			System.out.print(i + ", ");
		}
	}

}
