package com.malintha.thread.basic;

/**
 * Created by malintha on 12/16/15.
 * This class is demonstrating race condition
 */
public class ThirdClass {

    public static void main(String[] args) {

        MyPrinter myPrinter = new MyPrinter();

        MyRunnableJob firstJob = new MyRunnableJob("First", myPrinter);
        MyRunnableJob secondJob = new MyRunnableJob("Second", myPrinter);
        MyRunnableJob thirdJob = new MyRunnableJob("Third", myPrinter);

        new Thread(firstJob).start();
        new Thread(secondJob).start();
        new Thread(thirdJob).start();
    }
}
