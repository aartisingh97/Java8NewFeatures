package com.leetcode.practice;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode list = addTwoNumbers(l1, l2);

		printList(list);
	}

	// Helper method to print the linked list
	public static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		int carry = 0;
		ListNode cur = dummy;
		while (l1 != null || l2 != null || carry != 0) {
			int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			carry = s / 10;
			cur.next = new ListNode(s % 10);
			cur = cur.next;
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		return dummy.next;
	}

}
