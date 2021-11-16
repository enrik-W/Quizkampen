package Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InformationBuilder {

    QuestionDatabase informationBase = new QuestionDatabase();
    QuestionBuilder info = informationBase.getQuestion(0);
    ArrayList<JButton> buttonList = new ArrayList<>();

    public ArrayList<JButton> buttonBuilder() {

        JButton button1 = new JButton(info.getCorrectAnswer());
        JButton button2 = new JButton(info.getAnswer1());
        JButton button3 = new JButton(info.getAnswer2());
        JButton button4 = new JButton(info.getAnswer3());

        button1.setPreferredSize(new Dimension(200, 100));
        button2.setPreferredSize(new Dimension(200, 100));
        button3.setPreferredSize(new Dimension(200, 100));
        button4.setPreferredSize(new Dimension(200, 100));

        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);

        return buttonList;
    }

    public String labelBuilder() {

        return info.getQuestion();
    }
}