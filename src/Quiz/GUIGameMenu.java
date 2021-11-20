package Quiz;

import javax.swing.*;
import java.awt.*;

public class GUIGameMenu {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        jFrame.setVisible(true);
        jFrame.pack();
        jFrame.add(jPanel);
        jFrame.setTitle("Quizkampen");
        jFrame.setSize(500,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color panelColor = new Color(30,120,200);
        Color labelColor = new Color(30, 140, 250);
        Color buttonColor = new Color(30, 100, 150);

        jPanel.setVisible(true);
        jPanel.setBackground(panelColor);

        JLabel totalScore = new JLabel("0" + " - " + "0", SwingConstants.CENTER);
        totalScore.setFont(new Font("Arial", Font.BOLD, 48));
        totalScore.setPreferredSize(new Dimension(100, 100));
        totalScore.setForeground(Color.white);
        totalScore.setOpaque(false);

        JLabel score = new JLabel("3" + " - " + "2", SwingConstants.CENTER);
        score.setFont(new Font("Arial", Font.BOLD, 36));
        score.setPreferredSize(new Dimension(75,100));
        score.setForeground(Color.white);
        score.setOpaque(false);

        JLabel score1 = new JLabel("3" + " - " + "2", SwingConstants.CENTER);
        score1.setFont(new Font("Arial", Font.BOLD, 36));
        score1.setPreferredSize(new Dimension(75,100));
        score1.setForeground(Color.white);
        score1.setOpaque(false);

        JLabel score2 = new JLabel("3" + " - " + "2", SwingConstants.CENTER);
        score2.setFont(new Font("Arial", Font.BOLD, 36));
        score2.setPreferredSize(new Dimension(75,100));
        score2.setForeground(Color.white);
        score2.setOpaque(false);

        JLabel score3 = new JLabel("3" + " - " + "2", SwingConstants.CENTER);
        score3.setFont(new Font("Arial", Font.BOLD, 36));
        score3.setPreferredSize(new Dimension(75,100));
        score3.setForeground(Color.white);
        score3.setOpaque(false);

        JLabel bg = new JLabel();
        bg.setOpaque(true);
        bg.setBackground(labelColor);
        //bg.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        JLabel bg1 = new JLabel();
        bg1.setBackground(labelColor);
        bg1.setOpaque(true);

        JLabel bg2 = new JLabel();
        bg2.setBackground(labelColor);
        bg2.setOpaque(true);

        JLabel bg3 = new JLabel();
        bg3.setBackground(labelColor);
        bg3.setOpaque(true);

        JButton jButton = new JButton("");
        jButton.setPreferredSize(new Dimension(150,75));
        JButton jButton1 = new JButton("");
        jButton1.setPreferredSize(new Dimension(150,75));

        JButton jButton2 = new JButton("");
        jButton2.setPreferredSize(new Dimension(150,75));
        JButton jButton3 = new JButton("");
        jButton3.setPreferredSize(new Dimension(150,75));

        JButton jButton4 = new JButton("");
        jButton4.setPreferredSize(new Dimension(150,75));
        JButton jButton5 = new JButton("");
        jButton5.setPreferredSize(new Dimension(150,75));

        JButton jButton6 = new JButton("");
        jButton6.setPreferredSize(new Dimension(150,75));
        JButton jButton7 = new JButton("");
        jButton7.setPreferredSize(new Dimension(150,75));

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(totalScore, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(score, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(score1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(score2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton6, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(score3, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jPanel.add(jButton7, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 4;
        jPanel.add(bg, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 4;
        jPanel.add(bg1, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 4;
        jPanel.add(bg2, gbc);

       /* gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 4;
        jPanel.add(bg3, gbc); */

    }
}
