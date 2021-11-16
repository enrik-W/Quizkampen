package Quiz;

import java.io.*;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 33333;
        ServerSocket serverSocket = new ServerSocket(port);
        InformationBuilder information = new InformationBuilder();

        try {
            while (true) {
                Player player1 = new Player(serverSocket.accept(), information);
                Player player2 = new Player(serverSocket.accept(), information);

                player1.start();
                player2.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
