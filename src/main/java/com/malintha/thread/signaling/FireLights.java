package com.malintha.thread.signaling;

/**
 * Created by malintha on 12/17/15.
 */
public class FireLights implements Runnable {

    FireMessage fireMessage;

    public FireLights(FireMessage message){
        fireMessage=message;
    }
    public void run() {

        synchronized (fireMessage){
            System.out.println("Fire lights are waiting for fire :P ");
            try {
                fireMessage.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fire lights are blinking");
    }
}
