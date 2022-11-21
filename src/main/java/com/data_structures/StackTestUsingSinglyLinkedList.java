package com.data_structures;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTestUsingSinglyLinkedList {

    private static ListNode top = null;
    private int length;

    public StackTestUsingSinglyLinkedList() {
        this.length = 0;
        this.top = null;
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    private int pop() {
        if (isEmpty())
            throw new EmptyStackException();
        int result = top.data;
        top = top.next;
        length--;

        return result;
    }

    private int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private static void printLinkedList() {
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackTestUsingSinglyLinkedList stack = new StackTestUsingSinglyLinkedList();
        stack.push(78);
        stack.push(81);
        stack.push(15);

        printLinkedList();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        printLinkedList();

//        StackTestUsingSinglyLinkedList StringStack = new StackTestUsingSinglyLinkedList();
//        System.out.println(StringStack.length + "" + StringStack.top);
        Stack<Character> characterStack = new Stack<>();

        char[] charArr = "chanuka".toCharArray();
        for (char c : charArr) {
            characterStack.push(c);
        }
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = characterStack.pop();
        }
        System.out.println(new String(charArr));
    }
}
