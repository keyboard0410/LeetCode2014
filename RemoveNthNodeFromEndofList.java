package leetcode;

public class RemoveNthNodeFromEndofList {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) 
			return null;
		if(head.next == null && n==1) {
			return null;
		}
		ListNode t1 = head;
		ListNode t2 = head;
		ListNode pret1 = new ListNode(0);
		pret1.next = t1;
        int count = 0;
        while(t2 != null) {
        	t2 = t2.next;
        	count++;
        	if(count == n) {
        		break;
        	}
        }
        if(count == n && t2 == null) {
        	pret1.next = t1.next;
        	t1 = null;
        	return pret1.next;
        }
        if(count < n) {
        	return null;
        }
        while(t2 != null) {
        	t2 = t2.next;
        	pret1 = pret1.next;
        	t1 = t1.next;
        }
        pret1.next = t1.next;
        t1 = null;
        return head;
        
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
		ListNode t1 = new ListNode(1);
		ListNode t2 = new ListNode(2);
		t1.next = t2;
		ListNode t = removeNthFromEnd(t1, 2);
		while(t!= null) {
			System.out.println(t.val);
			t = t.next;
		}

	}

}
