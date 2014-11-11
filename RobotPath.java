package leetcode;


public class RobotPath {
	
	public int backtrack(int r, int c, int m, int n, int[][] flag) {
		if(r == m && c == n) {
			return 1;
		}
		if(r > m || c > n) {
			return 0;
		}
		if(flag[r + 1][c] == -1) {
			flag[r+1][c] = backtrack(r+1, c, m, n, flag);
		}
		if(flag[r][c+1] == -1) {
			flag[r][c+1] = backtrack(r, c+1, m, n, flag);
		}
		return flag[r+1][c] + flag[r][c+1];
	}
	
	public int backtrack(int r, int c, int m, int n) {
		int[][] flag = new int[100][100];
		for(int i = 0; i < flag.length; i++) {
			for(int j = 0; j < flag[0].length; j++) {
				flag[i][j] = -1;
			}
		}
		return backtrack(r, c, m, n, flag);
	}
	
	public static int backtrackBottomUp(int m, int n, int[][] matrix) {
		for(int i = m - 2; i >= 0; i--) {
			for(int j = n -2; j >= 0; j--) {
				matrix[i][j] = matrix[i + 1][j] + matrix[i][j + 1];
			}
		}
		return matrix[0][0];
	}
	public static int backtrackBottomUp(int m, int n) {
		int[][] matrix = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i == m-1 || j == n-1) {
					matrix[i][j] = 1;
				}
			
			}
		}
		return backtrackBottomUp(m, n, matrix);
	}

	public static void main(String[] args) {
		System.out.println(new RobotPath().backtrack(0, 0, 4, 4));
		
		System.out.println();
		System.out.println(backtrackBottomUp(5, 5));
		
	
		
	}

}
