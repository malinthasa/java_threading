package com.malintha.thread.basic;

import java.util.Random;

/**
 * Created by malintha on 12/17/15.
 */
public class ThreadLocalRunnable implements Runnable {

    //generic thread local variable
    private ThreadLocal<Integer> myThreadLocalVariable = new ThreadLocal<Integer>();

    public void run() {
        setMyThreadLocalVariable();
        System.out.println("My local value is "+myThreadLocalVariable.get());
    }

    public void setMyThreadLocalVariable() {
        myThreadLocalVariable.set((int) (Math.random() * 100D));
    }
}
