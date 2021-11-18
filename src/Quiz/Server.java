package Quiz;

import java.io.*;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 55555;
        ServerSocket serverSocket = new ServerSocket(port);
        // Code for testing
        LocalQuestionDatabase test = new LocalQuestionDatabase();
        test.start();
        QuestionDatabase database = new QuestionDatabase();
        System.out.println(test.getQuestion(0).getAnswer1());
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
