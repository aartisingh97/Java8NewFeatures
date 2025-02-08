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

	public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		ListNode resultHead = new ListNode(0);
		int carryOver = 0;
		ListNode currentNode = resultHead;

		while (list1 != null || list2 != null || carryOver != 0) {
			int sum = (list1 == null ? 0 : list1.val) + (list2 == null ? 0 : list2.val) + carryOver;
			carryOver = sum / 10;
			currentNode.next = new ListNode(sum % 10);
			currentNode = currentNode.next;

			list1 = list1 == null ? null : list1.next;
			list2 = list2 == null ? null : list2.next;
		}

		return resultHead.next;
	}

}
