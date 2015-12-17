package com.malintha.thread.signaling;

/**
 * Created by malintha on 12/17/15.
 */
public class FireMessage {
   private String message;

    public FireMessage(String fm){
        message=fm;
    }

    public void setMessage(String fm){
        message=fm;
    }

    public String getMessage(){
        return  message;
    }
}
