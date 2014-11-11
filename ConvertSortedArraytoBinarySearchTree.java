package leetcode;

import leetcode.BinaryTreePreorderTraversal.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] num) {
		if(num.length == 0) 
			return null;
        return sortedArrayToBST(num, 0, num.length-1);
    }
	
	public TreeNode sortedArrayToBST(int[] num, int left, int right) {
		if(left>right) {
			return null;
		}
		int mid = (left + right)/2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBST(num, left, mid-1);
		root.right = sortedArrayToBST(num, mid+1, right);
		return root;
	}
	
	public static void main(String[] args) {

	}

}
