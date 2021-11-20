package Quiz;

import java.io.*;
import java.net.ServerSocket;

public class Server {
    private final static int port = 55555;
    private static ServerSocket serverSocket;
    private static QuestionDatabase database;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(port);
        database = new QuestionDatabase();

        try {
            while (true) {
                Player player1 = new Player(serverSocket.accept());
                player1.start();
                Player player2 = new Player(serverSocket.accept());
                player2.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
