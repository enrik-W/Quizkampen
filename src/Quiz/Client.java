package Quiz;

import javax.imageio.IIOException;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        int port = 33333;
        try {
            Socket clientSocket = new Socket("localhost", port);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Scanner sc = new Scanner(System.in);

            Thread sender = new Thread(new Runnable() {
                String msg;

                @Override
                public void run() {
                    while (true) {
                        msg = sc.nextLine();
                        out.println(msg);
                        out.flush();
                    }
                }
            });
            sender.start();
            Thread receiver = new Thread(new Runnable() {
                String msg;
                @Override
                public void run() {
                    try {
                        msg = in.readLine();
                        while (msg != null){
                            System.out.println("Server: " + msg);
                            msg = in.readLine();
                        }
                        System.out.println("Server out of service");
                        out.close();
                        clientSocket.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receiver.start();
        }
        catch (IOException e){
            System.out.println("Couldn't read port");
            System.exit(0);
        }

    }
}
