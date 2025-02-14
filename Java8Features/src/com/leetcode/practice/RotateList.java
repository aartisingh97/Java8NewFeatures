package com.leetcode.practice;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode list = rotateRight(head, 2);

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

	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode currentNode = head; // Renamed 'cur' to 'currentNode'
		int length = 0; // Renamed 'n' to 'length'

		// Calculate the length of the linked list
		for (; currentNode != null; currentNode = currentNode.next) {
			length++;
		}

		// Adjust 'k' to prevent unnecessary rotations
		k %= length;
		if (k == 0) {
			return head;
		}

		ListNode fastPointer = head; // Renamed 'fast' to 'fastPointer'
		ListNode slowPointer = head; // Renamed 'slow' to 'slowPointer'

		// Move the fast pointer 'k' steps ahead
		while (k-- > 0) {
			fastPointer = fastPointer.next;
		}

		// Move both fast and slow pointers until fast reaches the end
		while (fastPointer.next != null) {
			fastPointer = fastPointer.next;
			slowPointer = slowPointer.next;
		}

		// Re-arrange the pointers to rotate the list
		ListNode newHead = slowPointer.next; // Renamed 'ans' to 'newHead'
		slowPointer.next = null;
		fastPointer.next = head;

		return newHead;
	}

}
