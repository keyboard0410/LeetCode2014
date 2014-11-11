package leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import leetcode.ListNode;

public class ReorderList {
	
	
	
	public void reorderList(ListNode head) {
	    // IMPORTANT: Please reset any member data you declared, as
	    // the same Solution instance will be reused for each test case.
	    if (head == null || head.next == null) return;
	    ListNode fast = head;
	    ListNode slow = head;
	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    ListNode reverseHead = slow.next;           // find the second half of list
	    slow.next = null;                           // make first half end point to null
	    reverseHead = reverse(reverseHead);         // reverse second half     
	    ListNode cur = head;        
	    while(reverseHead != null) {                // link together
	        ListNode tmp = reverseHead.next;
	        reverseHead.next = cur.next;
	        cur.next = reverseHead;
	        cur = cur.next.next;
	        reverseHead = tmp;
	    }
	}
	public ListNode reverse(ListNode head) {
	    if (head == null || head.next == null) return head;
	    ListNode prev = new ListNode(0);
	    prev.next = head;
	    head = prev;
	    ListNode cur = prev.next;
	    while(cur.next != null) {
	        ListNode tmp = cur.next;
	        cur.next = tmp.next;
	        tmp.next = prev.next;
	        prev.next = tmp;
	    }
	    return prev.next;
	}
	
	


	public static void main(String[] args) {

		LinkedList<ListNode> list = new LinkedList<ListNode>();
		ListNode head = new ListNode(1);
		list.add(head);
		ListNode node1 = new ListNode(2);
		list.add(node1);
		head.next = node1;
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(7);
		
		
		list.add(node2);
		list.add(node3);
		list.add(node4);
		list.add(node5);
		list.add(node6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		ListNode current = head;
		System.out.print(head.val);
		
		while(current.next != null) {
			
			System.out.print(" " + current.next.val);
			current = current.next;
		}
		//System.out.print(list);
		ReorderList test = new ReorderList();
		test.reorderList(head);
		System.out.println();
		
		
		ListNode current1 = head;
		System.out.print(head.val);
		
		while(current1.next != null) {
			
			System.out.print(" " + current1.next.val);
			current1 = current1.next;
		}

	}

}

