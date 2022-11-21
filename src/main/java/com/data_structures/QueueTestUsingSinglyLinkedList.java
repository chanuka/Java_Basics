package com.data_structures;

import java.util.NoSuchElementException;

public class QueueTestUsingSinglyLinkedList {

    private static ListNode front = null;
    private static ListNode rear = null;
    private int length;

    public QueueTestUsingSinglyLinkedList() {
        this.length = 0;
        this.front = null;
        this.rear = null;
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    private int dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
            int result = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            length--;
            return result;
        }
    }

    private int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
            return front.data;
        }
    }

    private int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
            return rear.data;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private static void printLinkedList() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueTestUsingSinglyLinkedList q = new QueueTestUsingSinglyLinkedList();
        q.enqueue(5);
        q.enqueue(54);
        q.enqueue(77);

        printLinkedList();

        q.dequeue();
        printLinkedList();

    }
}
