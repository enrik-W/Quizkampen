package Quiz;

import java.io.*;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 55555;
        ServerSocket serverSocket = new ServerSocket(port);
        QuestionDatabase database = new QuestionDatabase();
        database.start();
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
