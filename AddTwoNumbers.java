package leetcode;
/*
Author:     Gang Liu, liugang.zzq@gmail.com
Date:       May 28, 2014
Problem:    Add Two Numbers
Source:     https://oj.leetcode.com/problems/add-two-numbers/

Notes:
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Solution: .
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class AddTwoNumbers {
	
	public static ListNode addTwoNumbersTest (ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode fakeHead = new ListNode(0);
		
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode p3 = fakeHead;
		
		while(p1 != null || p2 != null) {
			if(p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			if(p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			p3.next = new ListNode(carry % 10);
			p3 = p3.next;
			carry /= 10;
		}
		if(carry == 1) {
			p3.next = new ListNode(1);
		}
		return fakeHead.next;
	}

	public static class ListNode {
		int val;
		ListNode next;
		
		public ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public static void main(String[] args) {
		ListNode t1 = new ListNode(2);
		ListNode t2 = new ListNode(4);
		ListNode t3 = new ListNode(3);
		ListNode tt1 = new ListNode(5);
		ListNode tt2 = new ListNode(6);
		ListNode tt3 = new ListNode(7);
		t1.next = t2;
		t2.next = t3;
		tt1.next = tt2;
		tt2.next = tt3;
		ListNode t = addTwoNumbersTest(t1, tt1);
		while(t != null) {
			System.out.println(t.val);
			t = t.next;
		}
		int i =10;
		while(i-- > 0) {
			System.out.println(i+"add");
		}
		System.out.println(Math.log(1000));
	}

}
