package leetcode;

public class InsertionSortList {
	
	 public static ListNode insertionSortList(ListNode head) {
		 
		 if(head == null || head.next == null) {
			 return head;
		 }
		 ListNode preHead = new ListNode(-1);
		 preHead.next = head;
		 ListNode run = head;
		 while(run != null && run.next != null) {
			 if(run.val > run.next.val) {
				 ListNode smallNode = run.next;
				 ListNode pre = preHead;
				 while(pre.next.val < smallNode.val) {
					 pre = pre.next;
				 }
				 ListNode temp = pre.next;
				 pre.next = smallNode;
				 run.next = smallNode.next;
				 smallNode.next = temp;
			 }
			 else {
				 run = run.next;
			 }
		 }
		 return preHead.next;
		
	    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(7);
		ListNode n3 = new ListNode(4);
 
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(12);
		ListNode n6 = new ListNode(5);
 
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n1 = insertionSortList(n1);
		printList(n1);
		

	}
	public static void printList(ListNode x) {
	
			while (x != null) {
				System.out.print(x.val + " ");
				x = x.next;
			}
			System.out.println();
		
 
	}	
	public static class ListNode {
		     int val;
		     ListNode next;
		    ListNode(int x) {
		          val = x;
		         next = null;
		     }
}
	
}
