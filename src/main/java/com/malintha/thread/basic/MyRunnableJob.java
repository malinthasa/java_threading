package com.malintha.thread.basic;

/**
 * Created by malintha on 12/16/15.
 */
public class MyRunnableJob implements Runnable {
    MyPrinter myPrinter;
    String threadName;

    MyRunnableJob(String tn, MyPrinter mp) {
        myPrinter = mp;
        threadName = tn;
    }

    public void run() {
        System.out.println("Starting " + threadName + " thread");
        myPrinter.print();
    }
}
