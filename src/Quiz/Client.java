package Quiz;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    private static int port = 55555;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public Client(String serverAddress) {
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

    public static void main(String[] args) {
        String serverAddress = "localhost";
        Client client = new Client(serverAddress);
        InformationBuilder information = new InformationBuilder();
        GUIGamePanel game = new GUIGamePanel(information);

        while (true) {

        }

    }
}
