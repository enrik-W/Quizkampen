package Quiz;

import javax.swing.*;
import java.awt.*;

public class GUIGamePanel {
    public GUIGamePanel(String question, String correctAnswer, String answer1, String answer2, String answer3) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        frame.setVisible(true);
        frame.pack();
        frame.setSize(500, 600);
        frame.add(panel);
        frame.setTitle("Quizkampen");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color panelColor = new Color(30,120,200);
        Color buttonColor = new Color(60,80,120);

        panel.setVisible(true);
        panel.setBackground(panelColor);

        JLabel jLabel = new JLabel(question, SwingConstants.CENTER);
        JButton jButton1 = new JButton(correctAnswer);
        JButton jButton2 = new JButton(answer1);
        JButton jButton3 = new JButton(answer2);
        JButton jButton4 = new JButton(answer3);

        jButton1.setPreferredSize(new Dimension(200, 100));
        jButton2.setPreferredSize(new Dimension(200, 100));
        jButton3.setPreferredSize(new Dimension(200, 100));
        jButton4.setPreferredSize(new Dimension(200, 100));

        jLabel.setOpaque(true);
        jLabel.setBackground(Color.white);
        jLabel.setPreferredSize(new Dimension(200, 150));
        jLabel.setFont(new Font("Arial", Font.BOLD, 16));

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(jLabel, gbc);

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(jButton1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(jButton2, gbc);

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(jButton3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(jButton4, gbc);

    }
}
