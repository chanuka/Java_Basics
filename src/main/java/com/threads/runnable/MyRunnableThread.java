package com.threads.runnable;

import org.springframework.ui.context.Theme;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("This is a Thead implements the Runnable Interface running..");
    }

    public static void main(String[] args) {
        MyRunnableThread mt = new MyRunnableThread();
        Thread t1 = new Thread(mt,"This is my Thread");
        t1.start();
        System.out.println(t1.getName());
    }
}
