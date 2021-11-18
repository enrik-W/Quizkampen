package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class InformationBuilder {
    private QuestionDatabase informationBase = new QuestionDatabase();
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

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setBackground(Color.GREEN);
                button1.setBorderPainted(false);
                button1.setOpaque(true);
                button1.setText("Rätt svar");
                button1.setFont(new Font("Arial", Font.BOLD,16));
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setBackground(Color.RED);
                button2.setBorderPainted(false);
                button2.setOpaque(true);
                button2.setText("Fel svar");
                button2.setFont(new Font("Arial", Font.BOLD,16));
                button1.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setBackground(Color.RED);
                button3.setBorderPainted(false);
                button3.setOpaque(true);
                button3.setText("Fel svar");
                button3.setFont(new Font("Arial", Font.BOLD,16));
                button1.setVisible(false);
                button2.setVisible(false);
                button4.setVisible(false);

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setBackground(Color.RED);
                button4.setBorderPainted(false);
                button4.setOpaque(true);
                button4.setText("Fel svar");
                button4.setFont(new Font("Arial", Font.BOLD,16));
                button1.setVisible(false);
                button2.setVisible(false);
                button4.setVisible(false);
            }
        });
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