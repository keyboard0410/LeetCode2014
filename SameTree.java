package leetcode;

public class SameTree {
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
            return true;
        }
         if(p!= null && q != null) {
             if(p.val == q.val) {
            	 if(p.left != null && q.left != null && p.right != null && q.right != null) {
            		 return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            	 }
            	 else if(p.left != null && q.left == null) {
            		 return false;
            	 }
            	 else if (p.left == null && q.left != null) {
            		 return false;
            	 }
            	 else if (p.right == null && q.right != null) {
            		 return false;
            	 }
            	 else if(p.right != null && q.right == null) {
            		 return false;
            	 }
            	 else if(p.left != null && q.left != null && p.right == null && q.right == null) {
            		 return isSameTree(p.left, q.left);
            	 }
            	 else if(p.left == null && q.left == null && p.right != null && q.right != null) {
            		 return isSameTree(p.right, q.right);
            	 }
            	 return true;
             }	
        }
       
        return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
