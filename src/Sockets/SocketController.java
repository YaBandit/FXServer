package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Dylan on 19/02/2015.
 */
public class SocketController {

    private final static int socketPort = 4444;

    public void StartSockets() {

        try {
            System.out.println("BEFORE");
            ServerSocket serverSocket = new ServerSocket(socketPort);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("yolo");
            System.out.println("AFTER");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
