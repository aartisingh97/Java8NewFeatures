package com.leetcode.practice;

class MergeTwoSortedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode list = mergeTwoLists(l1, l2);
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

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode handler = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				handler.next = l1;
				l1 = l1.next;
			} else {
				handler.next = l2;
				l2 = l2.next;
			}
			handler = handler.next;
		}

		if (l1 != null) {
			handler.next = l1;
		} else if (l2 != null) {
			handler.next = l2;
		}

		return head.next;
	}
}
