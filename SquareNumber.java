package leetcode;

public class SquareNumber {
	
	public static int solution(int[][] arr, int row, int col) {

		for(int p = 0; p < row; p++) {
			for(int q =0; q<col; q++) {
				if(p == 0) {
					arr[p][q] = q+1;
				}
				else if(q==0) {
					arr[p][q] = p+1;
				}
				else {
					arr[p][q] = arr[p][q-1] + arr[p-1][q] - arr[p-1][q-1] + Math.min(p+1, q+1);
				}
				
			}
		}
			
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		return arr[row -1][col-1];
	}
	public static int solution(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		return solution(arr, row, col);
	}

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		System.out.println(solution(arr));

	}

}
