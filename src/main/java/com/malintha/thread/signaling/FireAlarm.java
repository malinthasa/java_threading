package com.malintha.thread.signaling;

/**
 * Created by malintha on 12/17/15.
 */
public class FireAlarm implements Runnable {

    FireMessage fireMessage;

    public FireAlarm(FireMessage message){
        fireMessage=message;
    }
    public void run() {

        synchronized (fireMessage){
            System.out.println("Fire alarm is waiting for fire :P ");
            try {
                fireMessage.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fire alarm is ringing");
    }
}
