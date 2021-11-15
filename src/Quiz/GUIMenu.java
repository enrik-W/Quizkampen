package Quiz;

import javax.swing.*;
import java.awt.*;

public class GUIMenu {
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

        jPanel.setVisible(true);
        jPanel.setBackground(panelColor);

        JLabel jLabel = new JLabel();
        jLabel.setOpaque(true);
        jLabel.setPreferredSize(new Dimension(100, 550));

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        jPanel.add(jLabel, gbc);



    }
}
