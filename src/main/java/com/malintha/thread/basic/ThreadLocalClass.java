package com.malintha.thread.basic;

/**
 * Created by malintha on 12/17/15.
 */
public class ThreadLocalClass {
    public static void main(String[] args) {

        //creating shared runnable object
        ThreadLocalRunnable myRunnable= new ThreadLocalRunnable();

        //creating separate threads
        Thread threadX= new Thread(myRunnable);
        Thread threadY= new Thread(myRunnable);

        threadX.start();
        threadY.start();
    }
}
