package com.malintha.thread.basic;

/**
 * Created by malintha on 12/16/15.
 */
public class MySychronizedRunnableJob implements Runnable {
    MyPrinter myPrinter;
    String threadName;

    MySychronizedRunnableJob(String tn, MyPrinter mp) {
        myPrinter = mp;
        threadName = tn;
    }

    public void run() {
        synchronized (myPrinter) {
            System.out.println("Starting " + threadName + " thread");
            myPrinter.print();
        }
    }
}
