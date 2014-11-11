package leetcode;

public class LinkedListCycle {

	public boolean hasCycle(ListNode l) {
		if(l == null || l.next == null) {
			return false;
		}
		ListNode fast = l, slow = l;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
