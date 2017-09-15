package ru.hudrogen.apps;

import ru.hudrogen.client.Listener;
import ru.hudrogen.client.Publisher;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(Node.PORT);
        System.out.println("Started: " + serverSocket);

        /**Only if some client connects to server, socket will have value.
         * In this line server waits connection to itself*/
        Socket socket = serverSocket.accept();
        System.out.println("Client connected to the server: "+ socket);

        //TODO попробовать использовать общие in и out для клиента и сервера

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        System.out.println("Input and Output streams are created...");

        new Publisher(out).start();
        new Listener(in).start();

    }
}
