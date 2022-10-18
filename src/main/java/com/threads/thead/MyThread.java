package com.threads.thead;

public class MyThread extends Thread{
    public void run(){
        System.out.println("This is a Thead extend the Thread Class running..");
    }

    public static void main(String[] args) {
        MyThread mt= new MyThread();
        mt.start();
    }
}
