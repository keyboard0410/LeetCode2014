package leetcode;

public class GamePuzzle {

	public static void solution(char[] arr, int m) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 'O';
		}
		arr[m] = 'X';
		arr[m+1] = 'X';
		for(int i = 0; i < arr.length - 1; i++) {
			if(i != m && i != m+1) {
				if(arr[i] == 'O' && arr[i+1] == 'O') {
					System.out.println("position at (" + i+", "+ (i+1)+")");
				}
			}
		}
	}
	

	public static void main(String[] args) {
		char[] arr = new char[16];
		solution(arr, 4);

	}

}
