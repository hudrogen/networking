package ru.hudrogen.client;

import java.io.PrintWriter;
import java.util.Scanner;

/**This thread send text messages from client's console to out stream(supposedly to server)*/
public class Publisher extends Thread{

    /**Stream from client to server*/
    PrintWriter out;
    Scanner scanner = new Scanner(System.in);

    public Publisher(PrintWriter out) {
        this.out = out;
    }

    @Override
    public void run() {
        while (true){
            out.println(scanner.nextLine());
        }
    }
}
