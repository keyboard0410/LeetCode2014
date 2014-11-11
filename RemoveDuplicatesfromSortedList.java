package leetcode;


public class RemoveDuplicatesfromSortedList {

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode runner = head;
		while(runner != null && runner.next != null) {
			if(runner.next.val == runner.val) {
				ListNode temp = runner.next;
				runner.next= temp.next;
				temp = null;
				
			}
			else {
				runner = runner.next;
			}
			
		}
		return head;
        
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
		ListNode t3 = new ListNode(2);
		ListNode t4 = new ListNode(4);
		ListNode t5 = new ListNode(5);
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		t4.next = t5;
		printLinkedList(deleteDuplicates(t1));
	}

}
