package leetcode;

import java.util.ArrayList;

public class BinaryTreePreorderTraversal {
	
	public static ArrayList<Integer> preorderTraversal(TreeNode root, ArrayList<Integer> list) {
		
		if(root == null) {
			return list;
		}
		else {
			list.add(root.val);
			if(root.left != null)
				preorderTraversal(root.left, list);
			if(root.right != null)
				preorderTraversal(root.right, list);
		}
		return list;
    }
	
	public static ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		return preorderTraversal(root, list);
	}
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;
		ArrayList<Integer> list = preorderTraversal(t1);
		System.out.println(list);
		
	}
	

}
