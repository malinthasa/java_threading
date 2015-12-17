package com.malintha.thread.signaling;

/**
 * Created by malintha on 12/17/15.
 */
public class WaterPump implements Runnable {

    FireMessage fireMessage;

    public WaterPump(FireMessage message){
        fireMessage=message;
    }
    public void run() {

        synchronized (fireMessage){
            System.out.println("Water pump is waiting for fire :P ");
            try {
                fireMessage.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Water pimp is on");
    }
}
