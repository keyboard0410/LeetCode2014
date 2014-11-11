package leetcode;

public class MaximumDepthofBinaryTree {
	public static int maxDepth(TreeNode root) {
		if(root == null) {
            return 0;
        }
        if(root != null && root.left == null && root.right == null) {
            return 1;
        }
        int depth = 1;
        if(root.left != null && root.right != null) {
            depth = Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        }
        else if (root.left == null) {
        	depth = Math.max(depth, maxDepth(root.right) + 1);
        }
        else {
        	depth = Math.max(depth, maxDepth(root.left) + 1);
        }
        return depth;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(2);
		root.right = t2;
		t2.left = t3;
		System.out.println(maxDepth(root));
	}
	
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

}
