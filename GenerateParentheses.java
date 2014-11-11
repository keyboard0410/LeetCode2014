package leetcode;

import java.util.ArrayList;

public class GenerateParentheses {

	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> list = new ArrayList<String>();
		if(n == 0) {
			return list;
		}
		helper(n, list, 0, 0, "");
		return list;
    }
	public void helper(int n, ArrayList<String> list, int left, int right, String temp)  {
		if(left == n) {
			for(int i = 0; i < n - right; i++) {
				temp = temp + ")";
			}
			System.out.println(temp);
			list.add(temp);
			return;
		}
		if(left > right) {
			helper(n, list, left+1, right, temp+"(");
			helper(n, list, left, right+1, temp+")");
		}
		else {
			helper(n, list, left+1, right, temp+"(");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new GenerateParentheses().generateParenthesis(3);
		System.out.println(list);
	}

}
