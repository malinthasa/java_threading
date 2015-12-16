package com.malintha.thread.basic;

/**
 * Created by malintha on 12/16/15.
 */
public class SecondClass {

    //this example shows the execution order of multiple threads
    public static void main(String[] args) {
        System.out.println("This thread is " + Thread.currentThread().getName());
        for(int i=0;i<20;i++){
            new Thread(i+"thThread"){
                public void run(){
                    System.out.println("Current thread is " + Thread.currentThread().getName());
                }
            }.start();
        }
    }
}
