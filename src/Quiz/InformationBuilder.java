package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class InformationBuilder implements ActionListener {
    private LocalQuestionDatabase informationBase = new LocalQuestionDatabase();
    private QuestionBuilder info = informationBase.getQuestion(0);
    private ArrayList<JButton> buttonList = new ArrayList<>();
    private GameLogic logic = new GameLogic();
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton buttonPressed;
    private Client client;

    public InformationBuilder(Client client) {
        this.client = client;
        button1 = new JButton(info.getCorrectAnswer());
        button2 = new JButton(info.getAnswer1());
        button3 = new JButton(info.getAnswer2());
        button4 = new JButton(info.getAnswer3());

        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);

        for (int i = 0; i < buttonList.size(); i++) {
            if (i == 0) {
                buttonList.get(0).addActionListener(l -> correctAnswer());
                buttonList.get(0).setPreferredSize(new Dimension(200, 100));
            } else {
                buttonList.get(i).addActionListener(this);
                buttonList.get(i).setPreferredSize(new Dimension(200, 100));
            }

        }

    }

    public void correctAnswer() {
        button1.setBackground(Color.GREEN);
        removeAllActionListeners();
        client.addToScore();
        logic.sleepFunction();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonPressed = (JButton) e.getSource();
        buttonPressed.setBackground(Color.RED);
        button1.setBackground(Color.GREEN);
        removeAllActionListeners();
        logic.sleepFunction();
    }

    public JButton getButton(int index) {
        return buttonList.get(index);
    }

    public String labelBuilder() {
        return info.getQuestion();
    }

    public void removeAllActionListeners() {
        for (JButton button : buttonList) {
            button.removeActionListener(this);
        }

    }

    public void shuffle() {
        Collections.shuffle(buttonList);
    }

}