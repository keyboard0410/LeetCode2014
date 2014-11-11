package leetcode;

public class PaintingHouse {
	public static int paint(int[][] matrix) {
		int[][] price = new int[matrix.length][matrix[0].length];
		price[0][0] = matrix[0][0];
		price[0][1] = matrix[0][1];
		price[0][2] = matrix[0][2];
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 0; j < 3; j++) {
				price[i][j] = Math.min(price[i-1][j] + matrix[i][(j+1)%3], price[i-1][j] + matrix[i][(j+2)%3]);
			}
		}
		int min = price[matrix.length-1][0];
		for(int i = 1; i < 3; i++) {
			if(price[matrix.length-1][i] < min) {
				min = price[matrix.length-1][i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{2,3,4},{3,1,2},{3,5,2},{7,3,1},{3,8,8},{2,3,5}};
		System.out.println(paint(matrix));
	}

}
