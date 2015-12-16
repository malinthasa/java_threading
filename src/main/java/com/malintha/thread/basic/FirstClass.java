package com.malintha.thread.basic;

/**
 * Created by malintha on 12/16/15.
 */
public class FirstClass {

    public static void main(String[] args) {
        //creating a thread sub classing java.lang.Thread class
        MyThread myThread = new MyThread();
        myThread.start();

        //creating a thread inline
        Thread myHiddenThread = new Thread() {
            public void run() {
                System.out.println("This is my second thread");
            }
        };
        myHiddenThread.start();

        //creating a thread by implementing runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();

        //creating a thread inline implementing runnable interface
        Runnable mySecondRunnable = new Runnable() {
            public void run() {
                System.out.println("This is my second runnable");
            }
        };
        Thread mySecondRunnableThread = new Thread(mySecondRunnable);
        mySecondRunnableThread.start();


        //creating a thread providing a name
        Thread myNamedThread = new Thread(myRunnable,"My_Runnable_Thread");
        myNamedThread.start();
        System.out.println(myNamedThread.getName());

        //Accessing current thread object
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName());
    }
}
