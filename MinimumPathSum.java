package leetcode;

public class MinimumPathSum {

	public static int minPathSum(int[][] grid) {
		if(grid == null) {
		    return 0;
		}
		int[][] sum = new int[grid.length][grid[0].length];
		sum[0][0] = grid[0][0];
		for(int i = 1; i < grid[0].length; i++){
			sum[0][i] = grid[0][i]+sum[0][i-1];
		}
		for(int j = 1; j < grid.length; j++) {
			sum[j][0] = grid[j][0] + sum[j-1][0];
		} 
		for(int k = 1; k < grid.length; k++) {
			for(int m = 1;m < grid[0].length; m++) {
				sum[k][m] = grid[k][m] + Math.min(sum[k-1][m], sum[k][m-1]);
			}
		}
		return sum[grid.length-1][grid[0].length-1];
	        
	}
	public static int minPathSum(int[][] matrix, int r, int c, int m, int n) {
		int sum = 0;
		sum += matrix[0][0];
		while(r < m-1 && c < n-1) {
			if(matrix[r][c+1] > matrix[r+1][c]){
				sum +=  matrix[r+1][c];
				r++;
			}
			else {
				sum += matrix[r][c+1];
				c++;
			}
			
			
		}
		if(m != 1 || n != 1)
			sum += matrix[m-1][n-1];
	    return sum;
	}
	public static void main(String[] args) {
		int[][] grid = {{1,2},{5,6},{1,1}};
		System.out.println(minPathSum(grid));

	}

}
