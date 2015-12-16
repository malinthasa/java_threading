package com.malintha.thread.basic;

/**
 * Created by malintha on 12/16/15.
 * This class illustrate how we can avoid race conditions
 */
public class FourthClass {

    public static void main(String[] args) {

        MyPrinter myPrinter = new MyPrinter();

        MySychronizedRunnableJob firstJob = new MySychronizedRunnableJob("First", myPrinter);
        MySychronizedRunnableJob secondJob = new MySychronizedRunnableJob("Second", myPrinter);
        MySychronizedRunnableJob thirdJob = new MySychronizedRunnableJob("Third", myPrinter);

        new Thread(firstJob).start();
        new Thread(secondJob).start();
        new Thread(thirdJob).start();

    }
}
