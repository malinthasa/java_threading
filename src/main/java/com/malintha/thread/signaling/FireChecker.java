package com.malintha.thread.signaling;

import sun.plugin2.message.Message;

/**
 * Created by malintha on 12/17/15.
 */
public class FireChecker implements Runnable {

    FireMessage fireMessage;
    public FireChecker(FireMessage fm){
        fireMessage=fm;
    }

    public void run() {
        synchronized (fireMessage) {
            for (int i = 0; i < 20; i++) {
                System.out.println("Checking for fire");
            }
            System.out.println("Fire....!!!!!!!   Fire....!!!!!!!   Fire.........!!!!!");
            fireMessage.setMessage("Fire");
            fireMessage.notifyAll();
        }


    }
}
