package Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class InformationBuilder {
    private LocalQuestionDatabase informationBase = new LocalQuestionDatabase();
    private QuestionBuilder info = informationBase.getQuestion(0);
    private ArrayList<JButton> buttonList = new ArrayList<>();

    public InformationBuilder() {
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
    }

    public JButton getButton(int index) {
        return buttonList.get(index);
    }

    public String labelBuilder() {
        return info.getQuestion();
    }

    public void shuffle() {
        Collections.shuffle(buttonList);
    }
}