package ru.hudrogen.apps;

import ru.hudrogen.client.Listener;
import ru.hudrogen.client.Publisher;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        InetAddress servAddr = InetAddress.getByName("localhost");

        /**Client try to connect to determined server*/
        Socket socket = new Socket(servAddr, Node.PORT);
        System.out.println("have connected to the server via socket: " + socket);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        System.out.println("Input and Output streams are created...");

        new Publisher(out).start();
        new Listener(in).start();


    }
}
