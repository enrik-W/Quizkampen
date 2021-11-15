package Quiz;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        //Placeholder
        int port = 33333;
        ServerSocket serverSocket = new ServerSocket(port);
        try {
            while (true) {
            Player player1 = new Player(serverSocket.accept());
            Player player2 = new Player(serverSocket.accept());


            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
