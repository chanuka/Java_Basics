package com.java.calling_order;

public class MyArrayList<E> implements MyList<E> {

    transient Object[] elementData;
    private int index = 0;

    public MyArrayList() {
        this.elementData = new Object[10];
    }

    @Override
    public void myListAdd(E e) {
        this.elementData[index] = e;
        index++;
    }

    @Override
    public int myListRemove() {
        return 0;
    }

    public void myArrayListAdd(E e) {
        this.myListAdd(e);
    }

    public Object myArrayGet(int index) {
        return this.elementData[index];
    }

    public int myArrayListRemove() {
        return 0;
    }
}
