package leetcode;

public class MergeSortedArray {
	
	public static void merge(int A[], int m, int B[], int n) {
        int indexA = 0;
        int indexB = 0;
       
        for(int i = A.length - 1; i >=0; i--) {
        	
        	if(indexA == m ) {
        		A[i] = B[n - 1 - indexB];
        		indexB++;
        	}
        	else if(indexB == n ) {
        		A[i] = A[m - 1 - indexA];
        		indexA++;
        	}
        	
        	else if(A[m - 1 - indexA] > B[n - 1 - indexB]) {
        		A[i] = A[m - 1 - indexA];
        		indexA++;
        	}
        	else {
        		A[i] = B[n - 1 - indexB];
        		indexB++;
        	}
        	
        	if(indexA == m && indexB == n) {
        		break;
        	}
        }
        for(int k = 0; k < A.length; k++) {
        	
        	System.out.println(A[k]);
        }
       
    }

	public static void main(String[] args) {
		int[] A = new int[] {1, 4,0,0};
		int[] B = {2, 5};
		merge(A, 2, B, 2);

	}

}
