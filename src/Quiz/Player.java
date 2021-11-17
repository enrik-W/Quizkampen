package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Player extends Thread {
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    private InformationBuilder information;

    public Player(Socket socket, InformationBuilder information) {
        this.socket = socket;
        this.information = information;

        try {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {

       // GUIGamePanel game = new GUIGamePanel(this.information);
    }
}
