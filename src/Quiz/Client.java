package Quiz;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private int port = 55555;
    private int score;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private int questionIndex;

    public Client(int score, int questionIndex) {
        this.questionIndex = questionIndex;
        this.score = score;

    }

    public void play() {
        try {
            socket = new Socket("localhost", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (UnknownHostException e) {
            System.err.println("Unknown host");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int getScore() {
        return score;
    }

    public void addToScore() {
        score++;
    }

    public void updateGamepanel(InformationBuilder information) {
        GUIGamePanel updatedGame = new GUIGamePanel(information);
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public static void main(String[] args) {
        String serverAddress = "localhost";
        Client client = new Client(0, 0);
        client.play();
        InformationBuilder information = new InformationBuilder(client.score, client.questionIndex);
        GUIGamePanel game = new GUIGamePanel(information);

    }
}
