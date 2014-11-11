package leetcode;

public class UniquePaths2 {

    public static int uniquePaths(int m, int n) {
    	int[][] matrix = new int[m][n];
    	for(int i = 0; i < m; i++) {
    		for(int j =0; j < n; j++) {
    			if(i==m-1 || j== n-1) {
    				matrix[i][j] = 1;
    			}
    			
    		}
    	}
    	
    	for(int i = m-2; i>=0; i--) {
    		for(int j =n-2; j>=0; j--) {
    			
    			matrix[i][j] = matrix[i][j+1] + matrix[i+1][j];
    		}
    	}
    	return matrix[0][0];
    }
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
