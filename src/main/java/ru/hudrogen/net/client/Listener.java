package ru.hudrogen.client;

import java.io.BufferedReader;
import java.io.IOException;

/**This thred listens stream from server and prints characters from thread */
public class Listener extends Thread{

    /**Stream from server*/
    BufferedReader in;

    /**Run of stopped this thread to receive messages from server*/
    private boolean stopped;

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }

    public Listener(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run() {
        while (!stopped){
            try {
                String msg = in.readLine();
                System.out.println(msg);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
