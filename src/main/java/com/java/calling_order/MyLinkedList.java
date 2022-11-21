package com.java.calling_order;

import java.util.LinkedList;

public class MyLinkedList<E> implements MyList<E> {

    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

    }

    public void MyLinkedList() {

    }

    private void addFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            size++;
    }

    private void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public void myListAdd(E e) {
        if (first == null)
            addFirst(e);
        else
            linkLast(e);
    }

    public Object myLinkListGet(int index) {
        if (index == 0 && first != null) {
            return first.item;
        } else {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x.item;
        }
    }

    @Override
    public int myListRemove() {
        return 0;
    }
}
