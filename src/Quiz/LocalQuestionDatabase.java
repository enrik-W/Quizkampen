package Quiz;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class LocalQuestionDatabase extends Thread {
    private ServerSocket serverSocket;
    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private ArrayList<QuestionBuilder> questionList = new ArrayList<>();

    public LocalQuestionDatabase() throws IOException {
        serverSocket = new ServerSocket(12345);
    }

    public QuestionBuilder getQuestion(int index) {
        return questionList.get(index);
    }

    public void setQuestionList() {
        try {

            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);

            questionList = (ArrayList<QuestionBuilder>) objectInputStream.readObject();
            serverSocket.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
            e.printStackTrace();
        }
    }

    public void run() {
        setQuestionList();
    }

}
