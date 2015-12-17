package com.malintha.thread.signaling;

/**
 * Created by malintha on 12/17/15.
 */
public class Room {

    public static void main(String[] args) {

        FireMessage fireMessage= new FireMessage("fire detector");

        //creating thread which makes wait on all others
        new Thread(new FireAlarm(fireMessage)).start();
        
        //waiting threads on fire thread
        new Thread(new FireChecker(fireMessage)).start();
        new Thread(new FireLights(fireMessage)).start();
        new Thread(new WaterPump(fireMessage)).start();

    }
}
