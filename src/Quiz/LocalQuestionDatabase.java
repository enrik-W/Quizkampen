package Quiz;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class LocalQuestionDatabase {
    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private ArrayList<QuestionBuilder> questionList = new ArrayList<>();

    public LocalQuestionDatabase() {
        try {
            socket = new Socket("localhost", 12345);
            inputStream = socket.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);

            questionList = (ArrayList<QuestionBuilder>) objectInputStream.readObject();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
            e.printStackTrace();
        }
    }

    public QuestionBuilder getQuestion(int index) {
        return questionList.get(index);

    }

}
