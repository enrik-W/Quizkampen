package Quiz;

import javax.swing.*;
import java.awt.*;

public class GUIMenu {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridBagLayout());
        JPanel jPanel = new JPanel(new GridBagLayout());
        JPanel jPanel1 = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        // gbc.insets = new Insets(5, 5, 5, 5);
        // gbc.anchor = GridBagConstraints.CENTER;

        jFrame.setVisible(true);
        jFrame.pack();

        jFrame.setTitle("Quizkampen");
        jFrame.setSize(500,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Settings");
        mb.add(menu);
        jFrame.setJMenuBar(mb);

        Color panelColor = new Color(30,120,200);
        Color panelColor1 = new Color(10,10,10);

        JButton scoreBoard = new JButton("Scoreboard");
        JButton exit = new JButton("Exit");

        scoreBoard.setPreferredSize(new Dimension(85,50));
        exit.setPreferredSize(new Dimension(70,50));

        gbc.gridx = 1;
        gbc.gridy = 0;
        jPanel1.add(scoreBoard, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel1.add(exit, gbc);

        JButton newGame = new JButton("New Game");

        newGame.setPreferredSize(new Dimension(350,100));

        gbc.gridx = 1;
        gbc.gridy = 0;
        jPanel.add(newGame, gbc);

        jPanel1.setVisible(true);
        jPanel1.setBackground(panelColor1);
        jPanel1.setPreferredSize(new Dimension(500,100));
        jPanel1.setVisible(true);
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        jFrame.add(jPanel1, gbc);

        jPanel.setVisible(true);
        jPanel.setBackground(panelColor);
        jPanel.setPreferredSize(new Dimension(500,450));
        jPanel.setVisible(true);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        jFrame.add(jPanel, gbc);



    }
}
