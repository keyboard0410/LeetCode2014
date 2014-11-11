package leetcode;

public class MergeTwoSortedLists {

	public ListNode merge(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        ListNode fakeHead = new ListNode(0);
        ListNode t = fakeHead;
        while(p1 != null && p2 != null) {
        	if(p1.val < p2.val) {
        		t.next = p1;
        		p1 = p1.next;
        	}
        	else {
        		t.next = p2;
        		p2 = p2.next;
        	}
        	t = t.next;
        }
        if(p1 != null) {
        	t.next = p1;
        }
        if(p2 != null) {
        	t.next = p2;
        }
        return fakeHead.next;
	}
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	public static void main(String[] args) {
	}

}
