package com.data_structures;

public class SinglyLinkedList {
    private static ListNode head = null;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void printLinkedList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.head = new ListNode(5);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(4);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;

        printLinkedList();
    }
}

