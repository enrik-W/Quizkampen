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


    public Client(String serverAddress, int score) {
        this.score = score;
        try {
            socket = new Socket(serverAddress, port);
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
        this.score++;
    }

    public void updateGamepanel(){

    }

    public static void main(String[] args) {
        String serverAddress = "localhost";
        Client client = new Client(serverAddress, 0);
        InformationBuilder information = new InformationBuilder(client);
        GUIGamePanel game = new GUIGamePanel(information);

    }
}
