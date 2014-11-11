package leetcode;

public class SwapNodesinPairs {
	
	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode t = head;
		ListNode pre = new ListNode(0);
		pre.next = t;
		ListNode result = head.next;
        while(t != null && t.next != null) {
        	ListNode temp = t.next;
        	//System.out.println("temp:  "+temp.val);
        	t.next = temp.next;
        	//System.out.println("t.next:  "+t.next.val);
        	temp.next = t;
        	pre.next = temp;
        	pre = t;
        	//System.out.println("temp.next:  "+temp.next.val);
        	t = t.next;
        	//System.out.println("t:  "+t.val);
        }
        return result;
    }
	public static void printLinkedList(ListNode head) {
		ListNode t = head;
		while(t != null) {
			System.out.print(t.val+" --> ");
			t = t.next;
		}
	}
	public static void main(String[] args) {
		ListNode t1 = new ListNode(1);
		ListNode t2 = new ListNode(2);
		ListNode t3 = new ListNode(3);
		ListNode t4 = new ListNode(4);
		ListNode t5 = new ListNode(5);
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		t4.next = t5;
		
		
		printLinkedList(swapPairs(t1));
	}

}
