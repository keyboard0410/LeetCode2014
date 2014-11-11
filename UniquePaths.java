package leetcode;

public class UniquePaths {
	
    public static int uniquePaths(int r, int c, int m, int n) {
        if(r == m-1 && c == n-1) {
            return 1;
        }
        if(r >= m|| c >=n) {
            return 0;
        }
        return uniquePaths(r+1, c, m, n) + uniquePaths(r, c+1, m, n);
    }
    public static int uniquePaths(int m, int n) {
        return uniquePaths(0, 0, m, n);
    }

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 4));

	}

}
