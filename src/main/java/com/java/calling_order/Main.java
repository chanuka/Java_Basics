package com.java.calling_order;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyArrayList();

        list.myListAdd(1);

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.myArrayListAdd(2);
        myArrayList.myArrayListAdd(5);

        System.out.println(myArrayList.myArrayGet(9));

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.myListAdd(5);
        myLinkedList.myListAdd(8);
        myLinkedList.myListAdd(13);

        System.out.println(myLinkedList.myLinkListGet(2));

//        collectionTest();
    }

    private static void collectionTest() {

        List<Integer> al = new ArrayList<>(5);

        Queue<Integer> t = new LinkedList<>();

        List<Integer> al2 = new LinkedList<>();
        al2.add(5);
        al2.add(55);
        System.out.println(al2.get(3));

        Stack<Integer> s = new Stack<>();

        Set<Integer> st = new HashSet<>();

        st.add(2);
        st.add(1);
        st.forEach(System.out::println);

        al.forEach(System.out::println);

        t.forEach(System.out::println);
    }
}
